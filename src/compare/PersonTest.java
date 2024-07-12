package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PersonTest {

  public static void main(String[] args) {
    Set<Person> personSet = new TreeSet<>(new PersonComparator());
    personSet.add(new Person("이주환", 26));
    personSet.add(new Person("이준무", 27));
    personSet.add(new Person("김종완", 25));
    personSet.add(new Person("조용현", 28));
    personSet.add(new Person("김형주", 24));
//    Collections.sort(personSet);
    for (Person person : personSet){
      System.out.println(person.getName() + " : " + person.getAge());
    }
  }
}
