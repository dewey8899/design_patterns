package com.dewey.design_patterns.type.concrete.builder;

/**
 * @author dewey
 * @date 2023/10/3 17:08
 * @function 功能描述
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;

        private PersonBuilder() {
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, age);
        }
    }

}

