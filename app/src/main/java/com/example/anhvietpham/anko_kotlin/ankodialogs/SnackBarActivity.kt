package com.example.anhvietpham.anko_kotlin.ankodialogs

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.LinearLayout
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.button
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.linearLayout
import org.jetbrains.anko.sdk25.coroutines.onClick

class SnackBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        coordinatorLayout {
            backgroundColor = Color.parseColor("#f2f2f2")
            linearLayout {
                orientation = LinearLayout.VERTICAL
                button {
                    text = "Simple Snackbar"
                    onClick{
                        rootView.snackbar("Hello Anh Viet Pham")
                    }
                }
            }.lparams {
                gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
            }
        }
    }
}