package org.gfg;

public class Client {

    public static void main(String[] args) {
//        KeyAnalyzer keyAnalyzer = new ListKeyAnalyzerImpl();
//        KeyAnalyzer keyAnalyzer = new SetKeyAnalyzerImpl();
        KeyAnalyzer keyAnalyzer = new HashMapKeyAnalyzerImpl();
        // ref variable is of parent
        // obj is of child
        keyAnalyzer.storeKey("pen");
        keyAnalyzer.storeKey("pencil");
        keyAnalyzer.storeKey("laptop");
        keyAnalyzer.storeKey("table");
        keyAnalyzer.storeKey("ring");
        keyAnalyzer.storeKey("charger");
        keyAnalyzer.storeKey("pen");
        keyAnalyzer.storeKey("pen");
        keyAnalyzer.storeKey("pen");
        keyAnalyzer.storeKey("charger");
        keyAnalyzer.storeKey("charger");
        keyAnalyzer.storeKey("charger");
        keyAnalyzer.storeKey("paper");
        keyAnalyzer.storeKey("key");
        keyAnalyzer.storeKey("key");

//        System.out.println(keyAnalyzer.fetchKeys());
        System.out.println(keyAnalyzer.fetchKeysWithCount());

        System.out.println(keyAnalyzer.getTop5());

    }
}

//wants the top 5 searched element ?

