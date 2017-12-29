package jp.techacademy.kaneda.kenichi.javalog;

/**
 * Created by kaneda on 2017/12/28.
 */

import android.util.Log;

class Dog {
    // 変数
    String name;      // 名前
    int age;    // 年齢

    // コンストラクタ
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メソッド
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }
}
