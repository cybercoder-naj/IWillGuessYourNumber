package com.apps.nishant.iwillguessyournumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Card32 extends AppCompatActivity {
    public int result32;
    RadioButton yes32;
    Button cmdNext32;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card32);
        result32 = getIntent().getExtras().getInt("Result16");

        yes32 = (RadioButton)findViewById(R.id.radioButton_yes32);
        cmdNext32 = (Button)findViewById(R.id.button_next32);

        cmdNext32.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(yes32.isChecked()) {
                            result32 += 32;
                        }
                        Intent intent = new Intent("com.apps.nishant.iwillguessyournumber.Card64");
                        intent.putExtra("Result32", result32);
                        startActivity(intent);
                    }
                }
        );
    }
}
