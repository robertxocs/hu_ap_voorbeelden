package com.xocs.ap.generics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GenericPairTest {

    List<GenericPair<String,Integer>> pairs = new ArrayList<>();


    @Before
    public void before() {
        pairs.add(new GenericPair<>("key1",12));
        pairs.add(new GenericPair<>("key1",12));
        pairs.add(new GenericPair<>("key2",12));
        pairs.add(new GenericPair<>("key2",15));

    }

    @Test
    public void testEquals() {

        assertEquals(pairs.get(0),pairs.get(0));
        assertEquals(pairs.get(0),pairs.get(1));
        assertNotEquals(pairs.get(0),pairs.get(2));
        assertNotEquals(pairs.get(0),pairs.get(3));

        assertNotEquals(pairs.get(0),null);
    }

    @Test
    public void testHashCode() {
        assertEquals(pairs.get(0).hashCode(),pairs.get(0).hashCode());
        assertEquals(pairs.get(0).hashCode(),pairs.get(1).hashCode());
        assertNotEquals(pairs.get(0).hashCode(),pairs.get(2).hashCode());
        assertNotEquals(pairs.get(0).hashCode(),pairs.get(3).hashCode());
    }
}