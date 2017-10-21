package com.example.sofia.storyapp.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sofia.storyapp.R;
import com.example.sofia.storyapp.model.Story1;
import com.example.sofia.storyapp.model.page;

public class Story extends AppCompatActivity {
    public static final String TAG= Story.class.getSimpleName();
    private page[] pages;
    private Story1 store;
    private ImageView sImageView;
    private TextView sTextView;
    private Button choice1;
    private Button choice2;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        sImageView=(ImageView) findViewById(R.id.imageView);
        sTextView=(TextView) findViewById(R.id.textView);
        choice1=(Button) findViewById(R.id.choice1b);
        choice2=(Button) findViewById(R.id.choice2b);


        Intent int1 = getIntent();
        name = int1.getStringExtra(getString(R.string.key_name));
        if (name == null || name.isEmpty()){
            name="Error";
        }
        Log.d(TAG ,  name);
         store= new Story1();
        loadPage(0);

    }

    private void loadPage(int i) {
        final page p = store.getPage(i);

        Drawable image = ContextCompat.getDrawable(this, p.getImageID());
        sImageView.setImageDrawable(image);

        String pageText=getString(p.getTextId());
        pageText = String.format(pageText, name);
        sTextView.setText(pageText);


        if(p.isFinals()) {
            choice1.setVisibility(View.INVISIBLE);
            choice2.setText("PLAY AGAIN");
            choice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //finish();
                    loadPage(0);
                }
            });
        }
        else{
            loadButtons(p);
        }


    }

    private void loadButtons(final page p) {
        choice1.setVisibility(View.VISIBLE);
        choice1.setText(p.getC1().getTextId());
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage=p.getC1().getNext();
                loadPage(nextPage);
            }
        });
        choice2.setVisibility(View.VISIBLE);
        choice2.setText(p.getC2().getTextId());
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage=p.getC2().getNext();
                loadPage(nextPage);
            }
        });
    }


}
