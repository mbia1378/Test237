package com.mbia.cyrille.test237;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Page_web extends AppCompatActivity {
    private String url;
    private WebView page;
    private Intent lien;
    public Intent liens_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_web);

        lien=getIntent();
        url=lien.getStringExtra("url");//"www.google.fr";
        page=(WebView)findViewById(R.id.webView);
        liens_activity=new Intent(this.getApplication(),Liens.class);
        WebSettings page_setting= page.getSettings();
        page_setting.setJavaScriptEnabled(true);
        page_setting.setLoadsImagesAutomatically(true);
        page.setWebViewClient(new WebViewClient());
        page.loadUrl("http://"+url);
    }

    @Override
    public void onBackPressed() {
        startActivity(liens_activity);
        finish();
        return;
    }

    public void onResume(Bundle savedInstanceState){
        super.onResume();
    }
    public void onStop(){
        super.onStop();

    }
    public void onRestart(){
        super.onRestart();

    }
}
