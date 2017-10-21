package com.example.sofia.storyapp.model;

import com.example.sofia.storyapp.R;

/**
 * Created by SOFIA on 7/17/2017.
 */

public class Story1 {
    private page[] pages;

    public Story1(){
      pages = new page[7];
        pages[0]= new page(R.drawable.page0, R.string.page0,
                new choice(R.string.page0_choice1, 1) ,
                new choice(R.string.page0_choice2, 2));
        pages[1]=new page(R.drawable.page1, R.string.page1,
                new choice (R.string.page1_choice1,3) ,
                new choice (R.string.page1_choice2,4));

        pages[2]=new page(R.drawable.page2, R.string.page2,
                new choice (R.string.page2_choice1,4) ,
                new choice (R.string.page2_choice2,6));

        pages[3]=new page(R.drawable.page3, R.string.page3,
                new choice (R.string.page3_choice1,4) ,
                new choice (R.string.page3_choice2,5));

        pages[4]=new page(R.drawable.page4, R.string.page4,
                new choice (R.string.page4_choice1,5) ,
                new choice (R.string.page4_choice2,6));

        pages[5]=new page(R.drawable.page5, R.string.page5);

        pages[6]=new page(R.drawable.page6, R.string.page6);



    }

    public page getPage(int i) {
        if(i >=pages.length){
            i = 0;
        }
        return pages[i];
    }
}
