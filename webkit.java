package com.umaribnuzm.webkit;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class webkit extends Activity {
    WebView browser;
    @Override
    public void onCreate (Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        browser=(WebView)findViewById(R.id.webkit);

        browser.loadData("<html><head></head><body>First Word displayed on the web browser</body></html>", "text/html","UTF-8");
    }
}
