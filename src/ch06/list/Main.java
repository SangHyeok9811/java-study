package ch06.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List<자료형> 변수형 = ArrayList<String>()
        // List는 중간에 구멍이 없으므로 null 체크 안해도됨.
        // 자료형에 따라서 다르게 작동하기 위해서 추가적인 매개변수를 <자료형>을 넣는다.
        // 자료형을 매개변수로 받는 것을 제네릭(generic)
        // 매개변수의 자료형은 기본(원시) 자료형(primitive type)은 안됨.
        // int/long... 안됨(x)
        List<String> list = new ArrayList<String>();      // 기본은 array로 하다가 필요할때 linked로 바꾸면됨.(탐색성능이 array가 조금 더 빠름)
//        List<String> list = new LinkedList<String>();   // array에서 linked로 바꿀때 이부분만 수정하면됨
        List<Integer> ListInt = new ArrayList<Integer>();
        List<String> list2;
        // 객체 추가
        list.add("칸나");
        list.add("캐니언");

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("---------------------------------");

        // 특정 위치의 값을 변경
        //리스트변수.set(인덱스, 객체);
        list.set(0, "쇼메");
        list.set(1, "데프트");
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("---------------------------------");

        System.out.println(list.size());

        System.out.println("---------------------------------");
        list.add("켈린");
        list.add("기인");
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("---------------------------------");
        // 1번 요소를 삭제
        list.remove(1);
        // 뒤에 있는 것을 전부 당겨옴, 구멍(null)이 안 생김
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("---------------------------------");
        // 2번에 객체 삽입
        list.add(2, new String("비디디"));
        for (String name : list) {
            System.out.println(name);
        }
        // 이렇게 중간에 요소를 삭제하거나, 추가하게되면
        // 뒤쪽요소를 당겨오거나 밀어야되는 overhead(추가적인연산) 발생
        // 이런 케이스 잦다면, ArrayList -> LinkedList
        //              요소추가,     전체탐색,      요소삭제/삽입
        // ArrayList    빠름          빠름          느림(많이)
        // LinkedList   느림          느림          빠름

    }
}
