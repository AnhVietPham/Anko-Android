package com.example.anhvietpham.anko_kotlin.ankocomponent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class AnKoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyActivityUI().setContentView(this)
    }
}

class MyActivityUI : AnkoComponent<AnKoActivity> {
    override fun createView(ui: AnkoContext<AnKoActivity>) = with(ui) {
        verticalLayout {
            textView("Anh Viet Pham ") {
                textSize = 24f
            }
            val name = editText()
            button("Say Hello") {
                onClick { ctx.toast("Hello, ${name.text}!") }
            }
        }
    }
}