package com.example.android.hajjhealthcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot);

        String html = "<iframe width=\"350\" height=\"430\" " +
                "src=\"https://console.api.ai/api-client/demo/" +
                "embedded/bbcfe49d-bc2e-4881-bb65-805b3573f572\"></iframe>";
        WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadData(html, "text/html", null);


    }
}
