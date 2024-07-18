package json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONObject;

public class ObjectToJson {
  private static Gson gson = new GsonBuilder()
      .disableHtmlEscaping()
      .setPrettyPrinting()
      .serializeNulls()
      .create();

  public static void main(String[] args) {
    studentToJson();
    jsonToStudent("{\"id\":1,\"name\":\"YOYO\"}");
  }

  private static void studentToJson(){
    Student student1 = new Student(1, "홍길동");
    System.out.println(gson.toJson(student1));
  }

  private static void jsonToStudent(String str){
    Student student2 = new Student();
    JSONObject jsonObject = new JSONObject(str);
    gson.toJson(jsonObject);
    student2.setId(jsonObject.getInt("id"));
    student2.setName(jsonObject.getString("name"));
    System.out.println("학생의 Id : " + student2.getId());
    System.out.println("학생의 name : " + student2.getName());
  }
}
