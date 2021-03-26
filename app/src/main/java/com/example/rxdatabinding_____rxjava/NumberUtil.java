package com.example.rxdatabinding_____rxjava;

public class NumberUtil {


    public static float getFloat(String message) {
        try {
            return Float.parseFloat(message);
        } catch (Exception e) {
            return 0;
        }
    }

}
