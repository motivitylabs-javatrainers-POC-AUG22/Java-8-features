package com.motivity.StreamAPI;

import com.motivity.predicate;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamApiMethods
{
    public static void removeDuplicate(List<Integer> list)
    {

        List<Integer> distinct =  list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);
        System.out.println("-----------------------------------------------------------");

    }
    public static void mapMethod(List<Integer> number){
        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);
        System.out.println("-----------------------------------------------------------------------");

    }
    public static void filterMethod(List<String> names){
        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);
        System.out.println("-----------------------------------------------------------------------");
    }
    public static void sortedMethod(List<String> names){
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
        System.out.println("-----------------------------------------------------------------------");

}
    public static void forEachMethod(List<Integer> number){
        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println(y));
        System.out.println("-----------------------------------------------------------------------");

    }
    public static  void collectMethodReturnsSet(List<Integer> numbers){
        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);
        System.out.println("-----------------------------------------------------------------------");



    }
    public static void reduceMethod(List<Integer> number){
        // demonstration of reduce method
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);
        System.out.println("-----------------------------------------------------------------------");
    }
    public static void comparaterSorting(List<Integer> number){
        //sorting elements
        Comparator<Integer> c =(i1, i2)->(i1<i2)?-1:(i1>i2)?1:0;
        Collections.sort(number,c);
        number.stream().forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");
    }
    public static void count(List<Integer> number){
        //counting the no of elements
        Stream<Integer> stream = number.stream();
        long count = stream.count();
        System.out.println("Total Values = "+count);
        System.out.println("--------------------------------------------------------------------");

    }
    public static void toLowercase(List<String> names){
        //coverting elements into lowerCase.
        Stream<String> stream1 = names.stream();
        Stream<String> stringStream = stream1.map((value) -> { return value.toLowerCase(); });
        stringStream.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------");
    }
    public static void listToArray(List<Integer> number){
        //coverting list elements into Array
        Stream<Integer> stream2 = number.stream();
        Object[] intArray = stream2.toArray();
        System.out.println(intArray);
        for (Object element : intArray) {
            System.out.println(element + " ");
        }
        System.out.println("-------------------------------------------------------------------");

    }
    public static void mixAndmax(List<Integer> numbers){
        //min and max
        Stream<Integer> stream4 = numbers.stream();
        int max_val = stream4.max((x,y)->x>y?1:-1).get();
        System.out.println("Max Value : "+max_val);
        int min_val = numbers.stream().min((x,y)->x<y?-1:1).get();
        System.out.println("Min Value : "+min_val);
        System.out.println("-----------------------------------------------------------------------");


    }
    public static void filterMethodInteger(List<Integer> number) {
        //using filter retreiving data based on condition
        List<Integer> newlist =number.stream().filter(n->n>3).collect(Collectors.toList());
        System.out.println(newlist);
        System.out.println("------------------------------------------------------------------------");
    }
    public static void optionalMethod(List<Integer> numbers){
        //to get sum of elements  using optional
        Stream<Integer> stream5 = numbers.stream();
        Optional<Integer> sum = stream5.reduce(Integer::sum);
        System.out.println("Sum = "+sum.get());
        System.out.println("--------------------------------------------------------------------------");

    }
    public static void predicateMethod(ArrayList<MLEmployee> l){

        Predicate<MLEmployee> p= e->e.getSalary()>1800;
        for(MLEmployee e:l){
            if(p.test(e)){
                System.out.println(e.getName()+" "+e.getSalary());
            }
        }
        System.out.println("-------------------------------------------------------");
    }
    public static void predicateJoining(int [] x) {
        Predicate<Integer> p1 = k -> k % 2 == 0;
        Predicate<Integer> p2 = k -> k > 2;
        //and() ,or() ,negate()
        System.out.println("the numbers which are  even and > 2");
        for (int x1 : x) {
            if (p1.and(p2).test(x1)) {
                System.out.println(x1);
            }
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("the numbers which are even or >2");
        for (int x2 : x) {
            if (p1.or(p2).test(x2)) {
                System.out.println(x2);
            }
        }
        System.out.println("------------------------------------------------------------------  ");
        System.out.println(" the numbers which are not even");
        for (int x3 : x) {
            if (p1.negate().test(x3)) {
                System.out.println(x3);
            }
        }

    }
}
