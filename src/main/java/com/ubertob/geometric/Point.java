package com.ubertob.geometric;


public primitive class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    private Point() {
        this.x =  0;
        this.y =  0;
    }

    public static Point origin() { return new Point(0, 0); }


//    public static Point origin = new Point(0, 0);//Exception in thread "main" java.lang.ClassCircularityError: com/ubertob/geometric/Point


    public static Point displace(Point p, int dx, int dy) {
        if (dx == 0 && dy == 0)
            return p;

        Point p2 = new Point(p.x + dx, p.y + dy);
        return p2;
    }

    public Point displace(int dx, int dy) {
        return Point.displace(this, dx, dy);
    }

}
