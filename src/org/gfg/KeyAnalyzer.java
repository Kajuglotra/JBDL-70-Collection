package org.gfg;

import java.util.List;
import java.util.Map;

public interface KeyAnalyzer {

    void storeKey(String key);

    List<String> fetchKeys();

    default Map<String, Integer> fetchKeysWithCount(){
        return  null;
    }

    default List<Keyword> getTop5(){
        return  null;
    }
}
