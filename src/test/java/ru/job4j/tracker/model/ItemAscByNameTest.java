package ru.job4j.tracker.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ItemAscByNameTest {
    @Test
    void whenItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("Саша"),
                new Item("Таня"),
                new Item("Влад")
        );
        List<Item> expected = Arrays.asList(
                items.get(2),
                items.get(0),
                items.get(1)
        );
        items.sort(new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    void whenItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Саша"),
                new Item("Таня"),
                new Item("Влад")
        );
        List<Item> expected = Arrays.asList(
                items.get(1),
                items.get(0),
                items.get(2)
        );
        items.sort(new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}