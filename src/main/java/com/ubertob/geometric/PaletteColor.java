package com.ubertob.geometric;

public primitive class PaletteColor {
    public final byte colorIndex;

    public PaletteColor(byte index) {
        colorIndex = index;
    }

    public static PaletteColor green(){
        return new PaletteColor((byte) 1);
    }

    public static PaletteColor blue(){
        return new PaletteColor((byte) 2);
    }

    public static PaletteColor red(){
        return new PaletteColor((byte) 3);
    }
}
