package com.example.uworks.zidingyiziti;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 自定义字体
 */
public class MainActivity extends AppCompatActivity {
    private TextView title;
    private TextView content;
    private String Title = "静夜思";
    private String Content = "床前明月光，\n疑是地上霜。\n举头望明月，\n低头思故乡。";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        title = (TextView) findViewById(R.id.text);
        content = (TextView) findViewById(R.id.text2);
        Typeface face = Typeface.createFromAsset(this.getAssets(), "fonts/luoxigangbi.TTF");
        title.setTypeface(face);
        title.setText(Title);
        Typeface typeface = Typeface.createFromAsset(this.getAssets(), "fonts/fangzhengjingleijianti.TTF");
        content.setTypeface(typeface);
        content.setText(Content);
    }
}
