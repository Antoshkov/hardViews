package com.e.hardviews

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class CustomView(
        context: Context
) : ConstraintLayout(context) {

    init {
        val view = View.inflate(context, R.layout.layout_custom, this)
        val textView: TextView = view.findViewById(R.id.textView)
        val buttom = view.findViewById<Button>(R.id.btn)
        buttom.setOnClickListener {
            textView.text = "Toha"
        }
    }

}