package com.consumer;

import java.io.Serializable;

public  record Point (int x, int y) implements Serializable {
    public  Point () {
        this(0,0);
    }

}
