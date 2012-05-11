package com.scala.example

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity extends Activity {

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    val textView = new TextView(this)
    textView.setText("Hello World!")
    setContentView(textView)
  }
}

