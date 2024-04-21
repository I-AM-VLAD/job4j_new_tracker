package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
    private String currentDateTimeFormat = created.format(formatter);

    public Item(int id, String name, LocalDateTime created) {
        this.id = id;
        this.name = name;
        this.created = created;
    }

    public String getCurrentDateTimeFormat() {
        return currentDateTimeFormat;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}