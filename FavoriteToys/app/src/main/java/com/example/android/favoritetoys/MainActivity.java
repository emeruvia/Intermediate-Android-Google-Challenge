package com.example.android.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mToysListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToysListTextView = (TextView) findViewById(R.id.tv_toy_names);
        String[] toyNames = ToyBox.getToyNames();
        for (String toy : toyNames) {
            mToysListTextView.append(toy + "\n");
        }
        // TODO (5) Loop through each toy and append the name to the TextView (add \n for spacing)
    }
}
