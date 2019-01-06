package com.example.alexgf.blackmirrorapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RatingBar rbar1;

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbar1 = (RatingBar)findViewById(R.id.rating_bar1);
        tv1 = (TextView)findViewById(R.id.txt_companion_name);
    }

    public void calificar(View view){
        Float rate = rbar1.getRating();
        String qrate = rate.toString();

        tv1.setText("You Rated: " + qrate);
    }
}
