package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ItemAscByNameTest {

    @Test
    public void compare() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "aaa"));
        items.add(new Item(3, "ccc"));
        items.add(new Item(2, "bbb"));
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(1, "aaa"));
        expected.add(new Item(2, "bbb"));
        expected.add(new Item(3, "ccc"));
        assertThat(items, is(expected));
    }
}