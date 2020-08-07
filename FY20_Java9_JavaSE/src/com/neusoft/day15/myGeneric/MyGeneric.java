package com.neusoft.day15.myGeneric;

public class MyGeneric<MVP> {
    //没有MVP类型，这里代表未知的一种数据类型
    //未来传递什么类型就是什么类型
    private MVP mvp;


    public MyGeneric(MVP mvp) {
        this.mvp = mvp;
    }

    public MyGeneric() {

    }

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }
}
