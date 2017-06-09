package com.aortmann;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aortmann on 08/06/17.
 */
class GroupBy {
    <T, G> Map<G, Collection<T>> groupBy(Collection<T> collection, Grouper<T, G> grouper) {
        Map<G, Collection<T>> hashMap = new HashMap<>();
        collection.forEach(x -> {
            G key = grouper.assignGroup(x);
            Collection<T> grouped = hashMap.getOrDefault(key, new ArrayList<>());
            hashMap.put(key, grouped);

            grouped.add(x);
        });
        return hashMap;
    }
}
