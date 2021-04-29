package com.vdubyk.hm7.task1;


import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Vitya", 24, Gender.MALE),
                new Person("Vitya", 24, Gender.MALE),
                new Person("Sveta", 45, Gender.FEMALE),
                new Person("Igor", 70, Gender.MALE),
                new Person("Olya", 15, Gender.FEMALE),
                new Person("Ivanka", 67, Gender.FEMALE),
                new Person("Maria", 22, Gender.FEMALE),
                new Person("Ostap", 17, Gender.MALE),
                new Person("Vasya", 33, Gender.MALE)
        );

        Set<String> listPersonFilter = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .filter(person -> person.getAge() < 60)
                .collect(
                        HashSet::new,
                        (set, person) -> set.add(person.toString()),
                        HashSet::addAll);
        listPersonFilter.forEach(System.out::println);
    }
}
