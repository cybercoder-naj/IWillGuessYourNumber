package com.apps.nishant.iwillguessyournumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Answer extends AppCompatActivity {
    public int lastresult;
    TextView txtResult;
    Button cmdAgain, cmdFinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        lastresult = getIntent().getExtras().getInt("Result64");

        txtResult = (TextView)findViewById(R.id.textView_result);
        cmdAgain = (Button)findViewById(R.id.button_again);
        cmdFinish = (Button)findViewById(R.id.button_finish);

        txtResult.setText(String.valueOf(lastresult));

        cmdAgain.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                }
        );

        cmdFinish.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        intent.putExtra("EXIT", true);
                        startActivity(intent);
                    }
                }
        );
    }
}
