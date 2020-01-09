package com.apps.nishant.iwillguessyournumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Card4 extends AppCompatActivity {
    public int result4;
    RadioButton yes4, no4;
    Button cmdNext4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card4);
        result4 = getIntent().getExtras().getInt("Result2");

        yes4 = (RadioButton)findViewById(R.id.radioButton_yes4);
        cmdNext4 =(Button)findViewById(R.id.button_next4);

        cmdNext4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(yes4.isChecked()) {
                            result4 += 4;
                        }
                        Intent i =new Intent("com.apps.nishant.iwillguessyournumber.Card8");
                        i.putExtra("Result4", result4);
                        startActivity(i);
                    }
                }
        );
    }
}
