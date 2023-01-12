package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity12 : AppCompatActivity() {
    lateinit var i1:ImageView
    lateinit var sp: Spinner
    lateinit var bu1: Button
    lateinit var et1: EditText
    lateinit var et2: EditText
    lateinit var et3: EditText
    lateinit var tv6:TextView
    lateinit var tv0:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)
        i1=findViewById(R.id.iv1)
        bu1=findViewById(R.id.bt1)
        et1=findViewById(R.id.edt_text)
        et2=findViewById(R.id.edt_text3)
        et3=findViewById(R.id.edt_text5)
        tv0=findViewById(R.id.textview0)
        val i = intent.extras
        val b = intent
        val v: Int = i!!.getInt("src")
        i1.setImageResource(v)
        var p= b.getStringExtra("titl")
        var p1= b.getStringExtra("auth")
        tv0.text="Book Name: $p \n"+"Author: $p1"
        bu1.setOnClickListener {
            var a= et1.text.toString()
            var b= et2.text.toString()
            var c= et3.text.toString()
            if (a.isEmpty() ||
                b.isEmpty() || c.isEmpty()
            ) {
                Toast.makeText(this, "Enter All Values", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Opening Book\n" +
                        "Book Name: $p\n" +
                        "Author: $p1", Toast.LENGTH_SHORT).show()
                gotourl("http://www.goodwin.ee/ekafoto/tekstid/Eco%20Umberto%20-%20The%20Name%20Of%20The%20Rose.pdf")
            }
        }

    }
    fun gotourl(s:String) {
        val url: Uri = Uri.parse(s)
        startActivity(Intent(Intent.ACTION_VIEW, url))
    }
}