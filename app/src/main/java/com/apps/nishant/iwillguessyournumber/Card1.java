package com.apps.nishant.iwillguessyournumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Card1 extends AppCompatActivity {
    private RadioButton yes1, no1;
    private Button cmdNext1;
    public int result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card1);

        yes1 = (RadioButton)findViewById(R.id.radioButton_yes);
        no1 = (RadioButton)findViewById(R.id.radioButton_no);
        cmdNext1 = (Button)findViewById(R.id.button_next1);

        cmdNext1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(yes1.isChecked()) {
                            result += 1;
                        }
                        Intent intent = new Intent("com.apps.nishant.iwillguessyournumber.Card2");
                        intent.putExtra("Result0", result);
                        startActivity(intent);
                    }
                }
        );
    }
}
