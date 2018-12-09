package com.example.anhvietpham.anko_kotlin.ankodialogs

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.sdk25.coroutines.onClick

class AnkoCommonSelectorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        coordinatorLayout {
            backgroundColor = Color.parseColor("#f2f2f2")
            linearLayout {
                orientation = LinearLayout.VERTICAL
                button {
                    text = "Simple Selector"
                    onClick{
                        val countries = listOf(
                            "Anh Viet Pham", "Doan Thanh Duong", "Nguyen Thuyet Duong", "Le Duc Anh"
                            ,"Pham Le Huy Hoang", "VietChelseaBoy", "Anh Viet Pham", "pham.anh.viet.vlth@gmail.com"
                        )
                        selector("What's your name?", countries) { _, i ->
                            toast("My name is ${countries[i]}, right?")
                        }
                    }
                }
            }.lparams {
                gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
            }
        }
    }
}