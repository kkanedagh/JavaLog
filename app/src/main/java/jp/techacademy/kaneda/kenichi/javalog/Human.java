package jp.techacademy.kaneda.kenichi.javalog;

import android.util.Log;

/**
 * Created by kaneda on 2017/12/29.
 */

public class Human extends Animal implements Thinkable {

    // 変数
    String hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。" + "年は" +  this.age + "歳です。");
    }

    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }

}
