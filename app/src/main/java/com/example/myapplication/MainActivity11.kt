package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity11 : AppCompatActivity() {
    lateinit var ib1:ImageButton
    lateinit var ib2:ImageButton
    lateinit var ib3:ImageButton
    lateinit var ib5:ImageButton
    lateinit var ib4:ImageButton
    lateinit var ib6:ImageButton
    lateinit var ib7:ImageButton
    lateinit var ib8:ImageButton
    lateinit var ib9:ImageButton
    lateinit var ib10:ImageButton
    lateinit var ib11:ImageButton
    lateinit var ib12:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)
        ib1 = findViewById(R.id.i1)
        ib2 = findViewById(R.id.i2)
        ib3 = findViewById(R.id.i3)
        ib4 = findViewById(R.id.i4)
        ib5 = findViewById(R.id.i5)
        ib6 = findViewById(R.id.i6)
        ib7 = findViewById(R.id.i7)
        ib8 = findViewById(R.id.i8)
        ib9 = findViewById(R.id.i9)
        ib10 = findViewById(R.id.i10)
        ib11 = findViewById(R.id.i11)
        ib12 = findViewById(R.id.i12)

        ib1.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            i.putExtra("src",R.drawable.the_name_of_rose)
            var s="The Name of the Rose"
            var s1="Umberto Eco"
            i.putExtra("titl",s)
            i.putExtra("auth",s1)
            startActivity(i)
        }
        ib2.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            i.putExtra("src",R.drawable.the_book_of_ldgingsjpg)
            var s="The Book of Longings"
            var s1="Sue Monk Kidd"
            i.putExtra("titl",s)
            i.putExtra("auth",s1)
            startActivity(i)
        }
        ib3.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            i.putExtra("src",R.drawable.thewinterking)
            var s="The Winter King"
            var s1="Bernard Cornwell"
            i.putExtra("titl",s)
            i.putExtra("auth",s1)
            startActivity(i)
        }
        ib4.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            var s="The Red Tent"
            var s1=" Anita Diamant"
            i.putExtra("titl",s)
            i.putExtra("auth",s1)
            i.putExtra("src",R.drawable.theredtentjpg)
            startActivity(i)
        }
        ib5.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            var s:String=" Violeta"
            var s1="Isabel Allende"
            i.putExtra("titl",s)
            i.putExtra("auth",s1)
            i.putExtra("src",R.drawable.violeta)
            startActivity(i)

        }
        ib6.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            var s="The Magnolia Palace"
            var s1="Fiona Davis"
            i.putExtra("titl",s)
            i.putExtra("auth",s1)
            i.putExtra("src",R.drawable.themagnolia)
            startActivity(i)
        }
        ib7.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            var s="Run, Rose, Run"
            var s1="James Patterson and Dolly Parton"
            i.putExtra("titl",s)
            i.putExtra("auth",s1)
            i.putExtra("src",R.drawable.run_rose_run)
            startActivity(i)
        }
        ib8.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            var s="Girl in Ice"
            var s1="Erica Ferencik"
            i.putExtra("titl",s)
            i.putExtra("auth",s1)
            i.putExtra("src",R.drawable.girlice)
            startActivity(i)
        }
        ib9.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            i.putExtra("src",R.drawable.roomate)
            var s="The Roommate"
            var s1="Rosie Dana"
            i.putExtra("titl",s)
            i.putExtra("auth",s1)
            startActivity(i)
        }
        ib10.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            i.putExtra("src",R.drawable.hola)
            var s="You Had Me at Hola"
            var s1="Alexis Daria"
            i.putExtra("titl",s)
            i.putExtra("auth",s1)

            startActivity(i)
        }
        ib11.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            var s="Dating Dr. Dil"
            var s1="Nisha Sharma"
            i.putExtra("titl",s)
            i.putExtra("auth",s1)
            i.putExtra("src",R.drawable.dating_dr_gil)
            startActivity(i)
        }
        ib12.setOnClickListener {
            val i = Intent(this, MainActivity12::class.java)
            var s="The Spanish Love Deception"
            var s1="Elena Armas"

            i.putExtra("titl",s)
            i.putExtra("auth",s1)

            i.putExtra("src",R.drawable.lovedecep)
            startActivity(i)
        }


    }
}