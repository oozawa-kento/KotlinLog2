package jp.techacademy.kento.oozawa.kotlinlog

import android.util.Log

open class Human: Animal,Thinkable {

    constructor(name: String, age: Int) : super(name, age) {
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。")
        Log.d("kotlintest", "年は" + "(" + this.age + "歳)" + "です。")
    }



}