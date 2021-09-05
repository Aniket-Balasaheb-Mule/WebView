 package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mWebView = findViewById<View>(R.id.webView) as WebView
        mWebView.loadUrl("https://gdsc.community.dev/jspm-narhe-technical-campus-pune/")

        val webSetting = mWebView.settings
        webSetting.javaScriptEnabled = true
        mWebView.webViewClient = WebViewClient()

        mWebView.canGoBack()
        mWebView.setOnKeyListener(View.OnKeyListener { v, keyCode, event->
            if(keyCode ==KeyEvent.KEYCODE_BACK

                &&event.action== MotionEvent.ACTION_UP
                &&mWebView.canGoBack()){
                mWebView.goBack()
                return@OnKeyListener true
            }
            false
        })
    }
}