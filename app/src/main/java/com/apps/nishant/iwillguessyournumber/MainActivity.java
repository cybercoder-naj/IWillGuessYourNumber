package com.apps.nishant.iwillguessyournumber;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button cmdPlay, cmdExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
        else if(getIntent().getBooleanExtra("Exit", false)) {
            finish();
        }

        OnButtonClickListener();
    }

    public void OnButtonClickListener() {
        cmdPlay = (Button)findViewById(R.id.button_play);
        cmdExit = (Button)findViewById(R.id.button_exit);

        cmdPlay.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.apps.nishant.iwillguessyournumber.Think");
                        startActivity(intent);
                    }
                }
        );

        cmdExit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                        adb.setMessage("Do you really want to leave?")
                                .setCancelable(true)
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                        i.putExtra("Exit", true);
                                        startActivity(i);
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                }).create().show();
                    }
                }
        );
    }
}
