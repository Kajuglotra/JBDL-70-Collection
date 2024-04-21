package org.gfg;

import java.util.*;

public class SetKeyAnalyzerImpl implements KeyAnalyzer
{

    private Set<String> keySet;

    public SetKeyAnalyzerImpl(){
//        keySet = new HashSet<>();
//        keySet = new LinkedHashSet<>();

         keySet = new TreeSet<>(Comparator.reverseOrder());
    }
    @Override
    public void storeKey(String key) {
        keySet.add(key);
    }

    @Override
    public List<String> fetchKeys() {
       return List.copyOf(keySet);
    }
}
