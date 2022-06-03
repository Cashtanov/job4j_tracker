package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compare() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "aaa"));
        items.add(new Item(3, "ccc"));
        items.add(new Item(2, "bbb"));
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item(1, "ccc"));
        expected.add(new Item(2, "bbb"));
        expected.add(new Item(3, "aaa"));
        assertThat(items, is(expected));
    }
}