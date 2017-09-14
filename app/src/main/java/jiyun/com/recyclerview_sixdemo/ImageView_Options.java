package jiyun.com.recyclerview_sixdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

/**
 * 项目名称: 城市通
 * 类描述:
 * 创建人: Administrator
 * 创建时间: 2017/7/24 0:04
 * 修改人:  张超
 * 修改内容:
 * 修改时间:
 */

public class ImageView_Options extends AppCompatActivity {
    private LinearLayout l;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_activity);
        getResources().openRawResource(R.drawable.lwz);


    }
}
