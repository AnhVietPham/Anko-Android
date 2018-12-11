package com.example.anhvietpham.anko_kotlin.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.button

//@DslMarker
//@Target(AnnotationTarget.TYPE)
//annotation class UIDSLMarker
//
//fun ViewGroup.textView(init:(@UIDSLMarker TextView).() -> Unit): TextView {
//    val textView = TextView(context)
//    textView.init()
//    addView(textView)
//    return textView
//}
//
//fun AppCompatActivity.verticalLayout(init:(@UIDSLMarker LinearLayout).() -> Unit): LinearLayout {
//    val layout = LinearLayout(this)
//    with(layout) {
//        orientation = LinearLayout.VERTICAL
//        init()
//    }
//    return layout
//}
//
//fun ViewGroup.editText(init:(@UIDSLMarker EditText).() -> Unit): EditText {
//    val editText = EditText(context)
//    editText.init()
//    addView(editText)
//    return editText
//}
//
//fun ViewGroup.button(init: Button.() -> Unit): Button {
//    val button = Button(context)
//    button.init()
//    addView(button)
//    return button
//}

class AnkoMyOwnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val layout = verticalLayout {
//            editText {
//                hint = "Name"
//                textSize = 24f
//            }
//            editText {
//                hint = "Password"
//                textSize = 24f
//            }
//            button("Login") {
//                textSize = 26f
//            }
//            textView {
//                text = "VietChelseaBoy 1"
//                textSize = 40f
//                textView {
//                    text = "VietChelseaBoy 2"
//                    textSize = 40f
//                    textView {
//                        text = "VietChelseaBoy 3"
//                        textSize = 40f
//                    }
//                }
//            }
//        }
//        setContentView(layout)
    }
}