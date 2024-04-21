package org.gfg;

import java.util.Arrays;
import java.util.Collections;

public class Keyword {
//        implements Comparable<Keyword> {

    private String key;
    private int count;

    public Keyword(String key, int count) {
        this.key = key;
        this.count = count;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

//    @Override
//    public int compareTo(Keyword o) {
//        if(o.getCount() > this.getCount()){
//            return 1;
//        } else if (o.getCount() <this.getCount()) {
//            return -1;
//        }else{
//            return 0;
//        }
//    }

    @Override
    public String toString() {
        return "Keyword{" +
                "key='" + key + '\'' +
                ", count=" + count +
                '}';
    }
}
