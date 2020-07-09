package com.example.andriodappanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView ganesh = (ImageView) findViewById(R.id.imageView);
        //ganesh.animate().alpha(0.2f).setDuration(3000); // alpha for fade , setDuration = Total time takes to change
        //ganesh.animate().rotation(3600f).setDuration(3000);  // rotation for rotate , setDuration = Total time takes to change
        //ganesh.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
        ganesh.animate().translationX(1000f).translationY(1000f).rotation(3600f).setDuration(3000);


        //ImageView motu = (ImageView) findViewById(R.id.imageView2);
       // motu.animate().alpha(0.5f).setDuration(3000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



        setContentView(R.layout.activity_main);
    }
}
