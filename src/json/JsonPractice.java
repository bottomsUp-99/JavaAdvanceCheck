package json;

import com.sun.security.jgss.GSSUtil;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonPractice {

  public static void main(String[] args) throws IOException {
    JSONObject user = new JSONObject();
    user.put("name", "이주환");
    user.put("age", 26);
    user.put("isMarried", false);

    JSONArray hobbies = new JSONArray();
    hobbies.put("food");
    hobbies.put("movie");
    hobbies.put("exercise");
    user.put("hobbies", hobbies);

    JSONObject address = new JSONObject();
    address.put("home", "경기도 고양시 일산동구 강송로 33 요진와이시티");
    user.put("address", address);

    String userValue = user.toString();
    Writer userWriter = new FileWriter("/Users/zoohwan_99/Documents/subfile/json", StandardCharsets.UTF_8);
    userWriter.write(userValue);
    userWriter.flush();
    userWriter.close();

    BufferedReader br = new BufferedReader(new FileReader("/Users/zoohwan_99/Documents/subfile/json", StandardCharsets.UTF_8));
    String str = br.readLine();
    br.close();

    JSONObject parseContent = new JSONObject(str);

    System.out.println("내 이름은 " + parseContent.getString("name"));
    System.out.println("내 나이는 " + parseContent.getInt("age"));
    System.out.println("내 결혼 유무는 " + parseContent.getBoolean("isMarried"));

    JSONArray hobbiesValue = parseContent.getJSONArray("hobbies");
    System.out.print("나의 취미는 ");
    for (int i = 0; i < hobbiesValue.length(); i++) {
      System.out.print(hobbiesValue.get(i) + "\t");
    }
    System.out.println("등등 이 있다.");

    JSONObject addressValue = parseContent.getJSONObject("address");
    System.out.println("집 주소는 " + addressValue.getString( "home"));
  }
}