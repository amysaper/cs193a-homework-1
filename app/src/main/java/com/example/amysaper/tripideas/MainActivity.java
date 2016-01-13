//Amy Saper, CS193A, First Assignment: Trip Ideas
//This program gives you four ideas for trips to take. Based on which button you click,
//it shows you an image that represents that destination to give you inspiration!
//I used the sample code from Lecture 2 for inspiration/health with the radio buttons and switching
//images, and I used Google Image search to find the images. Enjoy!

package com.example.amysaper.tripideas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void takeMeThere(View view) {
        int id = view.getId();
        ImageButton img = (ImageButton) findViewById(R.id.mainbutton);
        TextView t = (TextView)findViewById(R.id.caption);
        if (id == R.id.hawaiiradiobutton) {
            img.setImageResource(R.drawable.hawaii);
            t.setText("Relax on the beach!");
        } else if (id == R.id.australiaradiobutton) {
            img.setImageResource(R.drawable.australia);
            t.setText("Swim with turtles!");
        } else if (id == R.id.hongkongradiobutton) {
            img.setImageResource(R.drawable.hongkong);
            t.setText("New York on steroids!");
        } else {
            img.setImageResource(R.drawable.paris);
            t.setText("La vie est belle!");
        }
    }
}
