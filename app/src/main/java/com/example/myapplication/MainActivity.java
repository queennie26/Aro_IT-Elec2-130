package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.nfc.Tag;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG,"Button Clicked");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

   // private void loadFragment(Fragment fragment){
      //  FragmentManager fa = getSupportFragmentManager();
      //  FragmentTransaction fragmentTransaction = fa.beginTransaction();
      //  fragmentTransaction.replace(R.id.framelayout, fragment);
       // fragmentTransaction.commit();
   // }

}
