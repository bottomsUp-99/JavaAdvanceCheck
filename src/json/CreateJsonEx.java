package json;

import com.mysql.cj.xdevapi.JsonArray;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEx {

  public static void main(String[] args) throws IOException {
    //Json 객체 생성
    JSONObject root = new JSONObject();

    //String 속성 추가
    root.put("id", "ssg001");
    root.put("name", "신섹계");
    root.put("dept", "IT-Develop");
    root.put("job", "developer");

    //객체 속성 추가
    JSONObject phone = new JSONObject();
    phone.put("home", "01-3245-8989");
    phone.put("handphone1", "010-4454-8898");
    phone.put("handphone2", "010-4454-8898");
    root.put("phone", phone);

    //배열 객체 속성 추가
    JSONArray skill = new JSONArray();
    skill.put("Java");
    skill.put("C, C#");
    skill.put("Python");
    skill.put("JSP&Servlet");
    skill.put("Spring&SpringBoot");
    root.put("skill", skill);


    //JSON 객체 얻어오기
    String jsonValue = root.toString();
    System.out.println(jsonValue);
    System.out.println(root);

    //파일로 저장하기
    Writer jsonWriter = new FileWriter("/Users/zoohwan_99/Documents/subfile/json",
        StandardCharsets.UTF_8);
    jsonWriter.write(jsonValue);
    jsonWriter.flush();
    jsonWriter.close();
  }
}
