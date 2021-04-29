package com.vdubyk.hm7.task3;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class PersonCollector implements Collector<String, List<String>, List<Person>> {

    public PersonCollector() {
    }

    public static PersonCollector toPersonList() {
        return new PersonCollector();
    }

    @Override
    public Supplier<List<String>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<String>, String> accumulator() {
        return List::add;
    }

    @Override
    public BinaryOperator<List<String>> combiner() {
        return (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<String>, List<Person>> finisher() {
        return this::newPersonList;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.UNORDERED);
    }

    private List<Person> newPersonList(List<String> strings) {

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < strings.size() - 1; i = 2 + i) {
            persons.add(new Person(strings.get(i), strings.get(i + 1)));
        }
        return persons;
    }
}
