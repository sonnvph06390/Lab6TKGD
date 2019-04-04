package com.example.son.lab6tkgd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai2 extends AppCompatActivity {
    Button btn21;
    EditText editText21;
    TextView textView22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        btn21 = findViewById(R.id.btn21);
        editText21 = findViewById(R.id.edText21);
        textView22 = findViewById(R.id.tv22);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=editText21.getText().toString().trim();
                textView22.setText(data);
            }
        });
    }
}
