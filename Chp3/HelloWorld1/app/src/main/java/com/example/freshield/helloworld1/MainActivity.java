package com.example.freshield.helloworld1;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;

    private ImageView imageView;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.edit_text);
        imageView = (ImageView)findViewById(R.id.image_view);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
        /*
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You click Button", Toast.LENGTH_SHORT).show();
            }
        });
        */
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                //String inputText = editText.getText().toString();
                //Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                //imageView.setImageResource(R.drawable.imag_2);
                /*
                if (progressBar.getVisibility() == View.GONE){
                    progressBar.setVisibility((View.VISIBLE));
                }else {
                    progressBar.setVisibility((View.GONE));
                }
                */
                /*
                int progress = progressBar.getProgress();
                progress += 10;
                progressBar.setProgress(progress);
                */
                /*
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important.");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
                */
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            
            default:
                break;
        }
    }
}