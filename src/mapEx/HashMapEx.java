package mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();

    //객체 저장
    map.put(1, "김미란");
    map.put(2, "최미란");
    map.put(3, "박미란");
    map.put(4, "이미란");
    map.put(5, "고미란");
    map.put(6, "고미란");

    System.out.println(map.size());
    System.out.println("======================");

    Integer key = 1;
    String value = map.get(key);
    System.out.println(value);

    //keySet 컬렉션을 이용하여 반복자를 통해 키와 값을 가져오기
    Set<Integer> keySet = map.keySet();
    Iterator<Integer> keyIterator = keySet.iterator();
    while (keyIterator.hasNext()){
      Integer key1 = keyIterator.next();
      String value1 = map.get(key1);
      System.out.println("key : " + key1 + "\t" + "value : " + value1);
    }

    //엔트리set 컬렉션으로 반복해서 키와 값을 가져오기
    Set<Entry<Integer, String>> entrySet = map.entrySet();
    Iterator<Entry<Integer, String>> entryIterator = entrySet.iterator();
    while (entryIterator.hasNext()){
      Entry<Integer, String> entry = entryIterator.next();
      Integer key2 = entry.getKey();
      String value2 = entry.getValue();
      System.out.println("key : " + key2 + "\t" + "value : " + value2);
    }

    map.remove(1);
    map.remove(2, "최미란");
  }
}
