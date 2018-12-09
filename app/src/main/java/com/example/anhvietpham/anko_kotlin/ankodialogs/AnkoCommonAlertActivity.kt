package com.example.anhvietpham.anko_kotlin.ankodialogs

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.sdk25.coroutines.onClick

class AnkoCommonAlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        coordinatorLayout {
            backgroundColor = Color.parseColor("#f2f2f2")
            linearLayout {
                orientation = LinearLayout.VERTICAL
                button {
                    text = "Simple Alert"
                    onClick{
                        alert("Hi, Anh Viet Pham", "Have you tried turning it off and on again?") {
                            yesButton { toast("Oh…") }
                            noButton {}
                        }.show()
                    }
                }
            }.lparams {
                gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
            }
        }
    }
}