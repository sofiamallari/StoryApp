package com.example.sofia.storyapp.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sofia.storyapp.R;

public class MainActivity extends AppCompatActivity {
    private EditText mname;
    private Button mstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mname= (EditText) findViewById(R.id.name);
        mstart=(Button) findViewById(R.id.start);

        mstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n= mname.getText().toString();
                //Toast.makeText(MainActivity.this, n , Toast.LENGTH_LONG).show();
                starts(n);
            }
        });
    }

    private void starts(String n) {
        Resources resources= getResources();
        String key= resources.getString(R.string.key_name);
        Intent int1 = new Intent(this, Story.class);
        int1.putExtra(key, n);
        startActivity(int1);
    }


}
