package com.example.akcreation.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
GridView grid;
    String [] text ={"GingerBread", "honeyComb", "IceCream", "JellyBean", "Kitkat", "Lollipop"};
    int [] imageId ={ R.drawable.ic_accessibility_black_24dp, R.drawable.ic_accessible_black_24dp,
            R.drawable.ic_account_balance_black_24dp, R.drawable.ic_account_balance_wallet_black_24dp,
            R.drawable.ic_account_box_black_24dp, R.drawable.ic_account_circle_black_24dp};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageAdapter adapter = new ImageAdapter(MainActivity.this, text, imageId);
        grid = (GridView)findViewById(R.id.gridView);
        grid.setAdapter(adapter);
    }
}
