package ru.job4j.lombok;

public class LombokUsage {
    public static void main(String[] args) {
        var permission = Permission.of()
                .id(1)
                .name("name")
                .rules("a")
                .rules("b")
                .rules("c")
                .build();
        System.out.println(permission);

    }
}
