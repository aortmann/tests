package com.aortmann;

/**
 * Created by aortmann on 08/06/17.
 */
public interface Grouper<T, G> {
    G assignGroup(T x);
}