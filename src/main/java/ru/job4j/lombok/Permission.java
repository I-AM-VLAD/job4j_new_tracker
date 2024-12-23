package ru.job4j.lombok;

import java.util.List;
import lombok.*;

@Builder(builderMethodName = "of")
@ToString
public class Permission {
    private int id;
    private String name;

    @Singular("rules")
    private List<String> rules;
}

