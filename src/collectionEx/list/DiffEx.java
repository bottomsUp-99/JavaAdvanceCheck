package collectionEx.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SimpleTimeZone;

public class DiffEx {//ArrayList와 LinkedList 객체 추가 성능평가

  public static void main(String[] args) {
    List<String> list1 = new ArrayList();
    List<String> list2 = new LinkedList();

    //시작 시간과 끝 시간을 저장할 변수 선언
    long startTime;
    long endTime;

    //ArrayList와 LinkedList의 작업 속도 비교
    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      list1.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s ns \n", "ArrayList 걸린 시간 : ", endTime - startTime);


    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      list2.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s씬ns \n", "LinkedList 걸린 시간 : ", endTime - startTime);
    //ArrayList 걸린 시간 :   5535667 ns
    //LinkedList 걸린 시간 :    879750 ns
    //LinkedList가 훨 빠른 것을 알 수 있음.
    //ArrayList는 0번 인덱스에 새로운 객체가 추가되면서 기존 객체의 인덱스를 한 칸씩 미루는 작업을 해야 하므로, 전체 작업 시간이 오래 걸림.
  }
}
