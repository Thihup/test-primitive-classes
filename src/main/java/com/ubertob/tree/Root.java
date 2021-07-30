package com.ubertob.tree;

public primitive class Root implements Node {

   final private String name = "root"; //does not compile without a field

    @Override
    public String walkToRoot() {
        return "Root " + name;
    }
}
