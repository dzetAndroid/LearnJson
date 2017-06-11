package com.zet.learnjson;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zet.learnjson.model.Group;
import com.zet.learnjson.model.Tupian;
import com.zet.learnjson.util.ReUseUtil;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private WebView webView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        loadAssetsHtml();
        loadImage();

        testFastJson();
        testGson();
    }

    private void loadImage() {
        InputStream inputStream = getResources().openRawResource(R.raw.pisces);
        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
        imageView.setImageBitmap(bitmap);
    }

    /**
     * 加载AssetsHTML文件
     */
    private void loadAssetsHtml() {
        webView.loadUrl("file:///android_asset/index.html");
    }

    /**
     * 测试fastjson
     */
    private void testFastJson() {
        String groupJson = ReUseUtil.assetsGetString(MainActivity.this, "group_sample.json");
        Group group = JSON.parseObject(groupJson, Group.class);
        Log.d(TAG, "onCreate: " + group);

        String tupianJson = ReUseUtil.assetsGetString(MainActivity.this, "tupian.json");
        List<Tupian> tupianList = JSON.parseArray(tupianJson, Tupian.class);
        for (Tupian tupian : tupianList) {
            Log.d(TAG, "testFastJson: " + tupian);
        }
    }

    /**
     * 测试Gson
     */
    private void testGson() {
        String tupianJson = ReUseUtil.assetsGetString(MainActivity.this, "tupian.json");

        Gson gson = new Gson();

        List<Tupian> tupianList = new ArrayList<>();
        Type type = new TypeToken<List<Tupian>>() {
        }.getType();
        tupianList = gson.fromJson(tupianJson, type);
        for (Tupian tupian : tupianList) {
            Log.d(TAG, "testGson: " + tupian);
        }
    }

    private void initView() {
        webView = (WebView) findViewById(R.id.webView);
        imageView = (ImageView) findViewById(R.id.imageView);
    }
}
