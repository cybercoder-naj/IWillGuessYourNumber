package com.apps.nishant.iwillguessyournumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Card2 extends AppCompatActivity {
    public int result2;
    RadioButton yes2, no2;
    Button cmdNext2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card2);
        result2 = getIntent().getExtras().getInt("Result0");

        yes2 = (RadioButton)findViewById(R.id.radioButton_yes2);
        cmdNext2 = (Button)findViewById(R.id.button_next2);

        cmdNext2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(yes2.isChecked()) {
                            result2 += 2;
                        }
                        Intent intent = new Intent("com.apps.nishant.iwillguessyournumber.Card4");
                        intent.putExtra("Result2", result2);
                        startActivity(intent);
                    }
                }
        );
    }
}
