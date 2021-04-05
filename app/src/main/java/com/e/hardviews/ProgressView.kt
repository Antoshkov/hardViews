package com.e.hardviews

import android.content.Context
import android.util.AttributeSet
import android.view.View

class ProgressView : View {
    constructor (context: Context?) : super(context) {}
    constructor (context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor (context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        val view = View.inflate(context, R.layout.progress_view, null)
    }

}