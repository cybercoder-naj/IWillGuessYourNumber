package com.apps.nishant.iwillguessyournumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Card8 extends AppCompatActivity {
    public int result8;
    RadioButton yes8;
    Button cmdNext8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card8);
        result8 = getIntent().getExtras().getInt("Result4");

        yes8 = (RadioButton)findViewById(R.id.radioButton_yes8);
        cmdNext8 = (Button)findViewById(R.id.button_next8);

        cmdNext8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(yes8.isChecked()) {
                            result8 += 8;
                        }
                        Intent intent = new Intent("com.apps.nishant.iwillguessyournumber.Card16");
                        intent.putExtra("Result8", result8);
                        startActivity(intent);
                    }
                }
        );
    }
}
