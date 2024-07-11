package threadEx;

import collectionEx.board.Board;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {

  public static void main(String[] args) {
    //Vector 컬렉션 생성
    List<Board> list = new ArrayList<>();

    //작업 스레드 객체 생성하겠습니다.
    Thread threadA = new Thread(){
      @Override
      public void run() {
        //글(board) 1000개를 추가
        for (int i = 1; i <= 1000; i++) {
          list.add(new Board("제목" + i, "ssg" + i, "내용" + i));
        }
      }
    };
    Thread threadB = new Thread(){
      @Override
      public void run() {
        //글(board) 10000개를 추가
        for (int i = 1001; i <= 2000; i++) {
          list.add(new Board("제목" + i, "ssg" + i, "내용" + i));
        }
      }
    };

    //스레드 실행(작업 시작)
    threadA.start();
    threadB.start();

    try{
      threadA.join();
      threadB.join(); // 작업자 A, B 작업이 모두 종료 될 때까지 main 작업자를 기다리게 함.
    } catch (Exception e){

    }

    int size = list.size();

    System.out.println(size);
    for (Board board : list){
      System.out.println(board.getSubject());
    }
  }
}
