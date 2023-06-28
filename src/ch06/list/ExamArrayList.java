package ch06.list;

import com.myUniversity.student.Student;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Collections;

public class ExamArrayList {
    public static void main(String[] args) {
        List<String> flist = new ArrayList<String>();
        List<Integer> flistNum = new ArrayList<Integer>();

        // 1번 문제
        flist.add("사과");
        flist.add("바나나");
        flist.add("체리");

        // 2번 문제
        System.out.println(flist.size());   // 요소의 개수
        // 3번 문제
        System.out.println(flist.get(1));   // 해당 인덱스 요소
        // 4번 문제
//        flist.remove(1);
        flist.remove("바나나");
        System.out.println(flist);

        System.out.println("-------------------------------");
        // 5번 문제
        flist.add("딸기");
        System.out.println(flist);
        // 6번 문제
        flist.add(2, new String("오렌지"));
        System.out.println(flist);
        // 7번 문제
        for (String name : flist) {
            System.out.println(name);
        }
        // 8번 문제
        boolean booleanflist = (flist != null);
        System.out.println(booleanflist);
//        boolean isEmpty = flist.isEmpty();
//        System.out.println(flist.isEmpty());

        System.out.println("---------------------------------");

        // 10번 문제
        System.out.println(flist);

        String maxLength = "";
        for (String fruit : flist) {
            if (fruit.length() > maxLength.length()) {
                maxLength = fruit;
            }
        }
        System.out.println(maxLength);

        // 11번 문제
        System.out.println(flist);

        String minLength = flist.get(0);
        for (String fruit : flist) {
            if (fruit.length() < minLength.length()){
                minLength = fruit;
            }
        }
        System.out.println(minLength);

//        //9.
//        Collections.sort(flist);
//        System.out.println(flist);

        // 13번 문제
        System.out.println(flist);
        for(String fruit : flist){
            if (fruit.equals("체리")){
                System.out.println(fruit);
                break;
            }
        }
        System.out.println("----------------------------");
        // 14번 문제
        System.out.println(flist.size());

        flist.remove(flist.size() - 1);
        System.out.println(flist);

        ArrayList<String> lstName = new ArrayList<String>();
        java.util.List<Student> lstStudent = new ArrayList<Student>();

        lstStudent.add(new Student("한상혁"));
        lstStudent.add(new Student("조병훈"));
        lstStudent.add(new Student("홍영기"));
        Collections.sort(lstName);

        // @: at mark
        // 클래스명::필드명(getter)
        // 해당 클래스의 필드로 무언가를 하겠다 (:: = @)
        // 컬렉션s.sort(lstStudent, Comparator.comparing(클래스명::
        Collections.sort(lstStudent, Comparator.comparing(Student::getName));
        for (Student s : lstStudent) {
            System.out.println(s.getName());
        }
    }
}