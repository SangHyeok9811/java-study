package ch09;

import account.Account;
import student1.Student;

import java.util.ArrayList;
import java.util.List;

public class GenericExMain {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);

        int targetInt = 1;   // 몇개가 있는지 찾을 특정 요소

        CollectionUtil<Integer> utilInt = new CollectionUtil<>();
        int occurrenceCounts = utilInt.countOccurrences(numbers, targetInt);

        System.out.println("Number of occurrences of " + targetInt + ": " + occurrenceCounts);

        List<String> strList = new ArrayList<>();
        strList.add("apple");
        strList.add("banana");
        strList.add("apple");
        strList.add("cherry");
        strList.add("durian");
        strList.add("melon");

        String targetStr = "apple";   // 몇개가 있는지 찾을 특정 요소

        CollectionUtil<String> utilStr = new CollectionUtil<>();
        int occurrenceCounti = utilStr.countOccurrences(strList, targetStr);

        System.out.println("Number of occurrences of " + targetStr + ": " + occurrenceCounti);

        Cache<Student> c = new Cache<>();
        c.setData(new Student("한상혁",10));
        Student s = c.getData();

        Cache<Account> a = new Cache<>();
        a.setData(new Account("한상혁",10));
        Account b = a.getData();

    }
}