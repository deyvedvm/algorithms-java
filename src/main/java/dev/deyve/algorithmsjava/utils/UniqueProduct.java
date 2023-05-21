package dev.deyve.algorithmsjava.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueProduct {

    public static String firstUniqueProduct(String[] products) {

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String product : products) {
            map.put(product, map.containsKey(product) ? map.get(product) + 1 : 1);
        }
        return map.entrySet()
                .stream()
                .filter(product -> product.getValue() == 1)
                .findFirst().get().getKey();
    }

}