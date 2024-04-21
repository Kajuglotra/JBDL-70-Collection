package org.gfg;

import java.util.*;

public class HashMapKeyAnalyzerImpl implements KeyAnalyzer{

    private HashMap<String, Keyword> keyWithCountMap;
    private Queue<Keyword> queue;

    public HashMapKeyAnalyzerImpl(){
//        keyWithCountMap = new HashMap<>();
        keyWithCountMap = new LinkedHashMap<>();
        queue = new PriorityQueue<>(comparator);
    }

    Comparator<Keyword> comparator = new Comparator<Keyword>() {
        @Override
        public int compare(Keyword o1, Keyword o2) {
            return Integer.compare(o2.getCount(), o1.getCount());
        }
    };

    @Override
    public void storeKey(String key) {
        if(keyWithCountMap.containsKey(key)){
            // queue will also have the data
            Keyword keyword = keyWithCountMap.get(key);
            queue.remove(keyword);
            Keyword newKeyword = new Keyword(key, keyWithCountMap.get(key).getCount()+1);
            keyWithCountMap.put(key, newKeyword);
            queue.add(newKeyword);
        }else{
            Keyword keyword = new Keyword(key, 1);
            keyWithCountMap.put(key,keyword);
            queue.add(keyword);
        }
    }

    @Override
    public List<String> fetchKeys() {
        return null; // write how can keys be returned
    }

    @Override
    public Map<String, Integer> fetchKeysWithCount() {
        Map<String, Integer> returnMap = new HashMap<>();
       for(Map.Entry<String, Keyword> entry: keyWithCountMap.entrySet()){
           returnMap.put(entry.getKey(), entry.getValue().getCount());
       }
       return returnMap;
    }

    @Override
    public List<Keyword> getTop5(){
        List<Keyword> list = new ArrayList<>();
        for(int i = 0 ; i <4 ;i++){
            list.add(queue.poll());
        }
        return list;
    }
}
