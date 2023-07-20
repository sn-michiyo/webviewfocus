package com.example.webviewfocus

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.webviewfocus.ui.theme.WebviewFocusTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webview = findViewById<WebView>(R.id.webview)
        val html = 
                "<button id='button1' >" +
                "Focus should move here" +
                "</button>" +
                "<button id='button2' >" +
                "Click here" +
                "</button>" +
                "<script>document" +
                "   .getElementById('button2')" +
                "   .onclick = function() {" +
                "   document" +
                "   .getElementById('button1')" +
                "   .focus()" +
                "   console.log(\"clicked\");" +
                "   }" +
                "</script>"

        webview.loadData(html, "text/html", "UTF-8")
    }
}
