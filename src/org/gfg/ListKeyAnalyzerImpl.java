package org.gfg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListKeyAnalyzerImpl implements KeyAnalyzer{

    private List<String> keys;

    // early initialization

    public ListKeyAnalyzerImpl(){
//        keys = new ArrayList<>(); // lazy initiatliation
        keys = new LinkedList<>();
    }


    @Override
    public void storeKey(String key) {
        keys.add(key);
    }

    @Override
    public List<String> fetchKeys() {
       return keys;
    }
}
