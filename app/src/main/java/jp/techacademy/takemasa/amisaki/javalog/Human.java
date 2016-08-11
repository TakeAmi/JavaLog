package jp.techacademy.takemasa.amisaki.javalog;

import android.util.Log;

/**
 * Created by amisaki on 2016/08/11.
 */
class Human extends Animal implements Thinkable{

    String hobby;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say(){
        Log.d("javatest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」");
    }
    public void think(){
        Log.d("javatest","「私は" + this.hobby + "について考える」");
    }

}
