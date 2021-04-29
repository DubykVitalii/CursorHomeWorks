package com.vdubyk.hm7.task2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Oleg", 33, Gender.MALE, Country.UKRAINE),
                new Person("Svitlana", 22, Gender.FEMALE, Country.BELARUS),
                new Person("Jack", 22, Gender.MALE, Country.USA),
                new Person("Robert", 25, Gender.MALE, Country.AUSTRALIA),
                new Person("Marek", 11, Gender.MALE, Country.POLAND),
                new Person("Adolf", 50, Gender.MALE, Country.GERMANY),
                new Person("Satoshi", 40, Gender.MALE, Country.JAPAN),
                new Person("Nika", 29, Gender.FEMALE, Country.FRANCE),
                new Person("Bob", 19, Gender.MALE, Country.EGYPT),
                new Person("Mia", 80, Gender.FEMALE, Country.NEW_ZEALAND),
                new Person("Tom", 44, Gender.MALE, Country.ARGENTINA)
        );


        Map<Continent, Map<Country, Map<Gender, List<Person>>>> personsMap = persons.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .collect(Collectors.groupingBy(person -> person.getCountry().getContinent(),
                        Collectors.groupingBy(Person::getCountry,
                                Collectors.groupingBy(Person::getGender)))
                );

        personsMap.forEach((continent, countryListMap) -> {
            System.out.println("\u25CF " + continent);
            countryListMap.forEach((country, genderListMap) -> {
                System.out.println("\t\u25A0 " + country);
                genderListMap.forEach((gender, peopleList) -> {
                    System.out.println("\t\t\u25C6 " + gender);
                    peopleList.forEach(person -> System.out.println("\t\t\t\u25B6 " + person));
                });
            });
        });


    }
}
