package com.ubertob.generics;

import java.util.function.Function;

public primitive class Wrapper.val<T> {

    private final T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public <U> Wrapper<U> map(Function<T, U> f){
        return new Wrapper<>(f.apply(value));
    }

    public Wrapper<T> flatMap(Function<T, Wrapper<T>> f){
        return f.apply(value);
    }

}
