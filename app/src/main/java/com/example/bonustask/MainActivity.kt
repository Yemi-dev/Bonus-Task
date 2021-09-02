package com.example.bonustask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val see: TextView = findViewById(R.id.see)
        see.setOnClickListener{viewImage(it)}
        }

    private fun viewImage(view: View){
        val image: ImageView = findViewById(R.id.imageView)
        val image2: ImageView = findViewById(R.id.imageView2)
        val image3: ImageView = findViewById(R.id.imageView3)
        val text: TextView = findViewById(R.id.textView5)

            image.visibility = View.VISIBLE
            view.visibility = View.GONE
            image2.visibility = View.VISIBLE
            image3.visibility = View.GONE
            text.visibility = View.VISIBLE
        }
    }

