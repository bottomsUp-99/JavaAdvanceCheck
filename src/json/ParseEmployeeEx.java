package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class ParseEmployeeEx {

  public static void main(String[] args) throws IOException {
    //파일로부터 employee.json 파일을 읽어와야 함.
    BufferedReader br = new BufferedReader(new FileReader("/Users/zoohwan_99/Documents/subfile/json", StandardCharsets.UTF_8));

    String json = br.readLine();
    br.close();

    //JSON 파싱
    JSONObject root = new JSONObject(json);

    //String 속성 정보 읽기
    System.out.println(root.getString("id"));

    //객체 속성 정보 읽기
    JSONObject phone = root.getJSONObject("phone");
    System.out.println(phone.getString("home"));

    //배열 속성 정보 읽기
    JSONArray skill = root.getJSONArray("skill");
    System.out.print("skill : ");
    for (int i = 0; i < skill.length(); i++) {
      System.out.print(skill.get(i) + "\t\t");
    }
  }
}
