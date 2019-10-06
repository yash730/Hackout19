package com.example.test4;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class Event extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        WebView webView;

        setContentView(R.layout.activity_event);

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.google.com/search?rlz=1C1SQJL_enIN848IN848&ei=wCyZXYvqHI2YvQT1z7jIAw&q=events+near+me+&oq=events+near+me+&gs_l=psy-ab.3..0i273l2j0l8.3416.5293..7047...0.2..0.271.2030.0j1j8......0....1..gws-wiz.......0i71j33i22i29i30.fi9gRyidO08&uact=5&ibp=htl;events&rciv=evn#fpstate=tldetail&htidocid=iVnRB_F62NpZ4rL3JpA8-A%3D%3D&htivrt=events");

        }
    }

