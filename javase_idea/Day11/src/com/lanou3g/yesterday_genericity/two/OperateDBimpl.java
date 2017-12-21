package com.lanou3g.yesterday_genericity.two;

import com.lanou3g.yesterday_genericity.one.Databaswutil;

public class OperateDBimpl<T> implements OperateDB<T>{
    @Override
    public T operate(T t) {
        Databaswutil<T> dub = new Databaswutil<>();
        return null;
    }
}
