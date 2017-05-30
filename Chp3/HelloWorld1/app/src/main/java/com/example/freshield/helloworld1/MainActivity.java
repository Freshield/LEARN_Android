package com.example.freshield.helloworld1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.edit_text);
        imageView = (ImageView)findViewById(R.id.image_view);
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
                imageView.setImageResource(R.drawable.imag_2);
                break;
            default:
                break;
        }
    }
}
