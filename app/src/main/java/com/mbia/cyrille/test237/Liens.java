package com.mbia.cyrille.test237;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Liens extends AppCompatActivity {
    public ListView liens;
    public Intent main_activity;
    public String [] nos_sites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liens);

        liens=(ListView)findViewById(R.id.list_liens);
        nos_sites=new String[]{"www.gymglish.com","www.frantastique.com","www.vatefaireconjuguer.com","www.richmorning.com","www.anglais-conjugaison.com","www.delavignecorp.com"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nos_sites);
        liens.setAdapter(adapter);
        final Intent page_web=new Intent(this.getApplication(),Page_web.class);
        liens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                page_web.putExtra("url", nos_sites[position]);
                startActivity(page_web);
                finish();

            }
        });
        main_activity=new Intent(this.getApplication(),MainActivity.class);
    }

    @Override
    public void onBackPressed() {

        startActivity(main_activity);
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
