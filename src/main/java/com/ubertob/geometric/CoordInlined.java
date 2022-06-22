package com.ubertob.geometric;

public primitive class CoordInlined {

    public final int x;
    public final int y;

    public CoordInlined(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public static CoordInlined origin = new CoordInlined(0, 0);  SEGFAULT

    public static CoordInlined origin() {
        return new CoordInlined(0, 0);
    }


    public static CoordInlined of(int x, int y) {
        return new CoordInlined(x, y);
    }

}
