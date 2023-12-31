package ch09;

import java.util.LinkedList;

// 큐(Queue): 대기열, FIFO(First In First Out) 자료구조 (들어가는 곳과 나가는곳이 다르다?)
// 가장 먼저 들어간 것이 가장 먼저 처리됨
// ex) 메시지 처리 시스템
public class GenericQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    // 요소추가
    // 가장 마지막 위치에 넣음
    // ----------------------------------------
    //   넣는 위치   ... 3   2   1   나가는 위치
    // ----------------------------------------

    public void enqueue(T item) {
        queue.addLast(item);
    }

    // 요소 꺼내오기
    public T dequeue() {
        return queue.pollFirst();
    }
}
