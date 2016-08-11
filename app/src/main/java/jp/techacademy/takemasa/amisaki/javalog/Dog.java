package jp.techacademy.takemasa.amisaki.javalog;

import android.util.Log;

/**
 * Created by amisaki on 2016/08/09.
 */
class Dog implements Movable {

    static String to_jp = "犬";

    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void introduce(){
        Log.d("javatest","これは犬クラスです。");
    }

    public void say(){
        Log.d("javatest", this.name + "(" + this.age + ")" + "「わんわん」");
    }

    @Override
    public void move(){
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}
