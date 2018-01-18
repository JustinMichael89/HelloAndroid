package io.paperplane.techpanda.helloandroid;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Setup for the custom font for the Udacity business title
    TextView businessName;
    Typeface libelFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        businessName = (TextView)findViewById(R.id.business_name);
        libelFont = Typeface.createFromAsset(this.getAssets(), "fonts/libel-suit-rg.ttf");
        businessName.setTypeface(libelFont);
    }
}
