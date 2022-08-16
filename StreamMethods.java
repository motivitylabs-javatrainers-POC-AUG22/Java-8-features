package com.motivity.StreamAPI;
//  Program to illustrate Intermediate Method of Stream sorted() Method

import java.util.*;
import java.util.function.Function;

public class StreamMethods {

    public static void main(String[] args) {
        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5, 2, 5);
        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
        // create a list of String
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        //creating an array of integer elements
        int[] x ={1,5,10,15,17,18,30,26,39};

        Function<Integer , Integer> f = i->i*i;

        // to get only distinct values
        StreamApiMethods.removeDuplicate(number);

        // demonstration of map method
        StreamApiMethods.mapMethod(number);

        // demonstration of filter method
        StreamApiMethods.filterMethod(names);

        // demonstration of sorted method
        StreamApiMethods.sortedMethod(names);

        // demonstration of forEach method
        StreamApiMethods.forEachMethod(number);

        // collect method returns a set
        StreamApiMethods.collectMethodReturnsSet(numbers);

        // demonstration of reduce method
        StreamApiMethods.reduceMethod(number);

        //sorting elements
        StreamApiMethods.comparaterSorting(number);

        //counting the no of elements
        StreamApiMethods.count(number);

        //coverting elements into lowerCase.
        StreamApiMethods.toLowercase(names);

        //coverting list elements into Array
        StreamApiMethods.listToArray(number);

        //min and max
        StreamApiMethods.mixAndmax(numbers);

        //using filter retreiving data based on condition
        StreamApiMethods.filterMethodInteger(number);

        //to get sum of elements  using optional
        StreamApiMethods.optionalMethod(numbers);

        //creating Arraylist & demonstrating Employee details
        ArrayList<MLEmployee> l = new ArrayList<>();
        l.add(new MLEmployee("venu", 1234));
        l.add(new com.motivity.StreamAPI.MLEmployee("nikhil", 1894));
        l.add(new com.motivity.StreamAPI.MLEmployee("josna", 124));
        l.add(new com.motivity.StreamAPI.MLEmployee("satya", 12374));
        l.add(new com.motivity.StreamAPI.MLEmployee("ramya", 12));
        StreamApiMethods.predicateMethod(l);

        //joining two predicates
        StreamApiMethods.predicateJoining(x);

    }
}


