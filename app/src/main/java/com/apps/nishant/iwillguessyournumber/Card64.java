package com.apps.nishant.iwillguessyournumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Card64 extends AppCompatActivity {
    public int result64;
    RadioButton yes64;
    Button cmdNext64;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card64);
        result64 = getIntent().getExtras().getInt("Result32");

        yes64 = (RadioButton)findViewById(R.id.radioButton_yes64);
        cmdNext64 = (Button)findViewById(R.id.button_next64);

        cmdNext64.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(yes64.isChecked()) {
                            result64 += 64;
                        }
                        Intent intent = new Intent("com.apps.nishant.iwillguessyournumber.Answer");
                        intent.putExtra("Result64", result64);
                        startActivity(intent);
                    }
                }
        );
    }
}
