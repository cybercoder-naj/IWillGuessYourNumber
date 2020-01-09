package com.apps.nishant.iwillguessyournumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Card16 extends AppCompatActivity {
    public int result16;
    RadioButton yes16;
    Button cmdNext16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card16);
        result16 = getIntent().getExtras().getInt("Result8");

        yes16 = (RadioButton)findViewById(R.id.radioButton_yes16);
        cmdNext16 = (Button)findViewById(R.id.button_next16);

        cmdNext16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(yes16.isChecked()) {
                            result16 += 16;
                        }
                        Intent intent = new Intent("com.apps.nishant.iwillguessyournumber.Card32");
                        intent.putExtra("Result16", result16);
                        startActivity(intent);
                    }
                }
        );
    }
}
