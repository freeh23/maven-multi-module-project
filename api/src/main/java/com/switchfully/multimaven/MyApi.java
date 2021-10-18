package com.switchfully.multimaven;


import com.google.common.collect.Lists;


import java.util.List;


public class MyApi {
    public static void main(String[] args) {
        Person person1 = new Person("Free");
        Person person2 = new Person("Daan");
        List listOfPersons = Lists.newArrayList(person1, person2);
        System.out.println(listOfPersons);

    }
}
