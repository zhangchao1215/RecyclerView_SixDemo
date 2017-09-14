package jiyun.com.recyclerview_sixdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerAdapter adapter;
    private RecyclerView recyclerView;
    int a = 3;
    int b = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.mRecycler);

        GridLayoutManager manager = new GridLayoutManager(MainActivity.this,1);
        recyclerView.setLayoutManager(manager);


        adapter = new RecyclerAdapter( MainActivity.this);
        recyclerView.setAdapter(adapter);

        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inPreferredConfig = Bitmap.Config.RGB_565;


    }
}
