package jp.techacademy.takemasa.amisaki.javalog;

import android.util.Log;

/**
 * Created by amisaki on 2016/08/10.
 */

class BigDog extends Dog{
    static String to_jp = "大型犬";

    public BigDog(String name, int age){
        super(name, age);
    }

    public static void introduce(){
        Log.d("javatest", "これは大型犬クラスです。");
    }
}
