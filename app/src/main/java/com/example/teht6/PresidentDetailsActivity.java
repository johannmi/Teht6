package com.example.teht6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PresidentDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president_details);

        Bundle b = getIntent().getExtras();
        int i = b.getInt(MainActivity.EXTRA, 0);

        ((TextView)findViewById(R.id.textPresidentName))
                .setText(PresidentList.getInstance().getPresident(i).getName());
        ((TextView)findViewById(R.id.textYearA))
                .setText(Integer.toString(PresidentList.getInstance().getPresident(i).getYearA()));
        ((TextView)findViewById(R.id.textYearB))
                .setText(Integer.toString(PresidentList.getInstance().getPresident(i).getYearB()));
        ((TextView)findViewById(R.id.textDesc))
                .setText(PresidentList.getInstance().getPresident(i).getDesc());

    }
}
