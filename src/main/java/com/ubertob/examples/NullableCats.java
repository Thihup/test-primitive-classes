package com.ubertob.examples;

import com.ubertob.animals.Cat;

import java.util.ArrayList;
import java.util.List;

public class NullableCats {
    public final List<Cat.ref> cats = new ArrayList<>();

    void add(Cat.ref anotherCat) {
        cats.add(anotherCat);
    }

    void addNN(Cat anotherCat) {
        cats.add((Cat.ref)anotherCat);
    }


}
