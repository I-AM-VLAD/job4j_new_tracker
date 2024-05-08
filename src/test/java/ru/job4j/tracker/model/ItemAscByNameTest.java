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
                new Item("Влад"),
                new Item("Саша"),
                new Item("Таня")
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
                new Item("Таня"),
                new Item("Саша"),
                new Item("Влад")
        );
        items.sort(new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}