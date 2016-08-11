package jp.techacademy.takemasa.amisaki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human1 = new Human("網崎", 28);

        Human human2 = new Human("あみさき",5,"JAVAのコーディング");

        human1.say(); //human1.think()は hobby を定義していないので使えない。

        human2.say();
        human2.think();
    }
}

