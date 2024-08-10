package com.example.helloworld

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class HelloWorld : Activity() {

    override fun onCreate(bundle : Bundle?) {
        super.onCreate(bundle)

        val txt = TextView( this )
        txt.text = "Hello World"

        setContentView(txt)

        val btn = Button(this)

//        // TODO - Mover o texto para um resource do tipo String
//        btn.text = getString(R.string.button_text) // getString pega os textos do res.values.strings.xml
//        setContentView(btn)

        setContentView(R.layout.helloworld_layout) // importando o arquivo de layout do res.layout
        Log.v("HELLO", "onCreate() executado")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("HELLO", "onDestroy() executado")
    }

}