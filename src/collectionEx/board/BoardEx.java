package collectionEx.board;

import java.util.ArrayList;
import java.util.List;

public class BoardEx {

  public static void main(String[] args) {
    List<Board> boardList = new ArrayList<Board>();//Board는 게시물 1개를 말한다. boardList는 여러개의 게시물을 저장하는 저장소.
    boardList.add(new Board("맛있는 점심1", "이주환1", "선배! 마라탕 사주세여!"));
    boardList.add(new Board("맛있는 점심2", "이주환2", "탕후루도 같이~?"));
    boardList.add(new Board("맛있는 점심3", "이주환3", "그럼 제가 선배 맘에"));
    boardList.add(new Board("맛있는 점심4", "이주환4", "탕탕!! 후루후루!!"));
    boardList.add(new Board("맛있는 점심5", "이주환5", "탕탕!! 후루루루루루~~"));

    int boardSize = boardList.size();
    System.out.println(boardSize);

    //특정 인덱스를 지정하여 객체 가져오기
    Board board = boardList.get(2);
    System.out.println(board.getSubject() + "\t" + board.getWriter() + "\t" + board.getContent());
    System.out.println("=================================================");


    //boardList의 모든 게시글 다 출력해보기
    //1. index를 이용하기
    for (int i = 0; i < boardList.size(); i++) {
      Board board1 = boardList.get(i);
      System.out.println(board1.getSubject() + "\t" + board1.getWriter() + "\t" + board1.getContent());
    }
    System.out.println("=================================================");

    //2. enhanced for 문 활용하여 모든 객체 출력하기
    for (Board b : boardList){
      System.out.println(b.getSubject() + " " + b.getWriter() + " " + b.getContent());
    }
    Integer[][][] data_list = {
        {
            {1, 2, 3},
            {4, 5, 6}
        },
        {
            {7, 8, 9},
            {10, 11, 12}
        }
    };
    System.out.println(data_list[0][1][1]);
    System.out.println(data_list[1][1][2]);

    String dataset[] = {
        "Braund, Mr. Owen Harris",
        "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
        "Heikkinen, Miss. Laina",
        "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
        "Allen, Mr. William Henry",
        "Moran, Mr. James",
        "McCarthy, Mr. Timothy J",
        "Palsson, Master. Gosta Leonard",
        "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
        "Nasser, Mrs. Nicholas (Adele Achem)",
        "Sandstrom, Miss. Marguerite Rut",
        "Bonnell, Miss. Elizabeth",
        "Saundercock, Mr. William Henry",
        "Andersson, Mr. Anders Johan",
        "Vestrom, Miss. Hulda Amanda Adolfina",
        "Hewlett, Mrs. (Mary D Kingcome) ",
        "Rice, Master. Eugene",
        "Williams, Mr. Charles Eugene",
        "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
        "Masselmani, Mrs. Fatima",
        "Fynney, Mr. Joseph J",
        "Beesley, Mr. Lawrence",
        "McGowan, Miss. Anna",
        "Sloper, Mr. William Thompson",
        "Palsson, Miss. Torborg Danira",
        "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
        "Emir, Mr. Farred Chehab",
        "Fortune, Mr. Charles Alexander",
        "Dwyer, Miss. Ellen",
        "Todoroff, Mr. Lalio"
    };

    int count = 0;
    for (String s : dataset){
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'M') {
          count++;
          break;
        }
      }
    }
    System.out.println(count);

    int num = 0;
    for (int i = 0; i < dataset.length; i++) {
      if (dataset[i].indexOf("M") >= 0){
        num++;
      }
    }
    System.out.println(num);

    int number = 0;
    for (String s : dataset){
      if (s.indexOf("M") >= 0){
        number++;
      }
    }
    System.out.println(number);
  }
}
