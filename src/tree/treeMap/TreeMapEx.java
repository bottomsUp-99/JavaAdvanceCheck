package tree.treeMap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

  public static void main(String[] args) {
    TreeMap<String, Integer> treeMap = new TreeMap<>();

    //엔트리 저장
    treeMap.put("권용빈",90);
    treeMap.put("서유미",80);
    treeMap.put("김은강",95);
    treeMap.put("고재현",70);
    treeMap.put("이경진",83);
    treeMap.put("이지은",93);

    //정렬된 엔트리 하나씩 가져오기
    Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
    for (Entry<String, Integer> student : entrySet){
      System.out.println(student.getKey() + "---" + student.getValue());
    }

    //특정 키 검색하여 값 가져오기
    Entry<String, Integer> entry = null;
    entry = treeMap.firstEntry();
    System.out.println(entry.getKey() + "---" + entry.getValue());

    entry = treeMap.lastEntry();
    System.out.println(entry.getKey() + "---" + entry.getValue());

    entry = treeMap.lowerEntry("이지은");
    System.out.println(entry.getKey() + "---" + entry.getValue());

    //내림차순 정렬
    NavigableMap<String, Integer> descStudents = treeMap.descendingMap();
    Set<Entry<String, Integer>> descScoresSet = descStudents.entrySet();
    for (Entry<String, Integer> student : descScoresSet){
      System.out.print(student.getKey() + "---" + student.getValue());
    }
    System.out.println();

    //범위 검색 가능함
    NavigableMap<String, Integer> subStudent = treeMap.subMap("김", true, "이", false);
    for (Entry<String, Integer> subMap : subStudent.entrySet()){
      System.out.print(subMap.getKey() + "---" + subMap.getValue());
    }
    System.out.println();
  }
}
