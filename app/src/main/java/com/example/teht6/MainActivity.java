package com.example.teht6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA = "TEHT6_MESSAGE";
    // WAH

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.presidentsListView);

        lv.setAdapter(new ArrayAdapter<>(
                this,
                R.layout.president_item_layout,
                PresidentList.getInstance().getPresidents())
        );

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("TEHT6", "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(MainActivity.this,
                        PresidentDetailsActivity.class);
                nextActivity.putExtra(EXTRA, i);
                startActivity(nextActivity);
            }
        });

    }
}
