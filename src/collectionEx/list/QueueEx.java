package collectionEx.list;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

  public static void main(String[] args) {
    Queue<Integer> queue_int = new LinkedList<Integer>(); // integer형 큐 생성
    Queue<String> queue_string = new LinkedList<String>(); // String형 큐 생성

    queue_int.add(1);
    System.out.println(queue_int);
    queue_int.offer(2);
    System.out.println(queue_int);
    queue_int.offer(3);
    System.out.println(queue_int);
    System.out.println(queue_int.poll());
    System.out.println(queue_int);
    System.out.println(queue_int.remove());
    System.out.println(queue_int);
    System.out.println(queue_int.remove(2));
    System.out.println(queue_int);
  }
}
