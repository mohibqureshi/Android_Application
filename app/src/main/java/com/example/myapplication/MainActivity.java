package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void finish() {

        toast();
        super.finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button hello = (Button)findViewById(R.id.pehlabutton);
        final Button newText = (Button)findViewById(R.id.dusrabutton);
        final TextView t = (TextView) findViewById(R.id.tv);
        final TextView newt = (TextView) findViewById(R.id.nayatext);
        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hello.setText((hello.getText() == "Show Text")?"Hide Text": "Show Text");
                t.setVisibility((t.getVisibility() == View.VISIBLE)?View.INVISIBLE:View.VISIBLE);

            }
        });

        newText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newt.getVisibility() == View.INVISIBLE){
                    newt.setVisibility(View.VISIBLE);
                    newText.setEnabled(false);
                }

                else{
                    newText.setEnabled(true);
                }
            }

        });

        newt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                newText.setEnabled(true);
                newt.setVisibility(View.INVISIBLE);
                return true;
            }
        });

        Button exit = (Button) findViewById(R.id.exitt);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }


        });
        }


    public void toast() {
        Toast.makeText(this, "I am too young to exit", Toast.LENGTH_LONG).show();

    }
}