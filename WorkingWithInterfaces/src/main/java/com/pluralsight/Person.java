package com.pluralsight;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    // constructors
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // implementing interface method
    @Override
    public int compareTo(Person o) {
        // sorting by last names
        return this.lastName.compareTo(o.lastName);
    }

    // this helps create the output to display the actual names + age
    // concrete method
    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age;
    }
}
