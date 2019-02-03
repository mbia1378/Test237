package com.mbia.cyrille.test237;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String login="malek";
    private String password="hassani";
    public EditText log;
    public EditText psw;
    public Button connect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log=(EditText)findViewById(R.id.login);
        psw=(EditText)findViewById(R.id.password);
        connect= (Button)findViewById(R.id.connect);
        final Intent nos_liens = new Intent(this.getApplication(),Liens.class);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(log.getText().toString().equals("") | psw.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Veullez remplir tous les champs",Toast.LENGTH_SHORT).show();
                }else{
                    if(log.getText().toString().equals(login) & psw.getText().toString().equals(password)){
                        Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_SHORT).show();
                        startActivity(nos_liens);
                        finish();
                    }else{
                        Toast.makeText(getApplicationContext(),"Login ou mot de passe Incorect",Toast.LENGTH_SHORT).show();
                        log.setTextColor(Color.RED);
                        psw.setTextColor(Color.RED);
                    }
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
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
