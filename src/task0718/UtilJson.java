package task0718;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
//1. 품목(item)정보를 가지고 있는 상품(Tshirt)  정보 JSON (shirt.json)
//2. UtilJson.java  형태를 분석하여 코드를  완성하세요

public class UtilJson {

  public static JSONObject createJsonData() {
    /**
     * 모든 데이터를 담을 JSONObject 생성
     */

    JSONObject productInfo = new JSONObject();
    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 처리.
     * product_no
     * product_name
     */
    productInfo.put("product_no", 111);//제품 번호 넣어주시고~
    productInfo.put("product_name", "Tshirt");//제품명 넣어주시고~

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * extra_product_info JSONObject 생성
     */
    JSONObject extra_product_info = new JSONObject();

    extra_product_info.put("size", 110);//옷 사이즈 넣어주시고~
    extra_product_info.put("price", 35000);//옷 가격 넣어주시고~
    extra_product_info.put("qualityOfTheMaterial", "polyester");//옷 재질 넣어주시고~

    productInfo.put("extra_product_info", extra_product_info);

    /**
     * value로 Array를 가지는 프로퍼티 처리.
     * item_list JSONArray 생성
     */
    JSONArray item_list = new JSONArray();

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * item_list.* JSONObject 생성하세요
     */
    JSONObject item1 = new JSONObject();
    item1.put("TshirtStock", 15);//옷 재고 넣어주시고~
    item1.put("TshirtColor", "Black");//옷 색상 넣어주시고~
    item_list.put(item1);

    JSONObject item2 = new JSONObject();
    item2.put("TshirtStock", 40);//옷 재고 넣어주시고~
    item2.put("TshirtColor", "White");//옷 색상 넣어주시고~
    item_list.put(item2);

    JSONObject item3 = new JSONObject();
    item3.put("TshirtStock", 54);//옷 재고 넣어주시고~
    item3.put("TshirtColor", "Blue");//옷 색상 넣어주시고~
    item_list.put(item3);

    productInfo.put("item_list", item_list);

    parseJsonData(productInfo);
    System.out.println();
    parseJsonDataUseIterator(productInfo);

    return productInfo;
  }

  public static void parseJsonData(JSONObject jsonObject) {
    System.out.println("==========요기가 parseJsonData 메서드를 사용한 부분==========");

    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */
    JsonParser jsonParser = new JsonParser();
    //JsonParser 객체는 JSON 데이터를 파싱하는 Java의 클래스.
    //Java에서는 JSON 데이터를 파싱하여 객체나 배열로 변환하기 위해 JsonParser 객체를 사용할 수 있음.

    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */
    String string = UtilJson.jsonToString(jsonObject);
    JsonElement tShirtInfo = JsonParser.parseString(string);// JsonParser를 사용하여 JSON 문자열을 파싱
    JsonObject tShirtObject = tShirtInfo.getAsJsonObject();// JsonElement를 JsonObject로 캐스팅


    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */
    System.out.println("고객님께서 조회하신 제품의 번호는 " + tShirtObject.get("product_no").getAsInt() + "입니다.");
    System.out.println("고객님께서 조회하신 제품의 명칭은 " + tShirtObject.get("product_name").getAsString() + "입니다.");

    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */
    JsonObject extra_product_info = tShirtObject.getAsJsonObject("extra_product_info");
    System.out.println("고객님께서 조회하신 제품의 사이즈는 " + extra_product_info.get("size").getAsInt() + "입니다.");
    System.out.println("고객님께서 조회하신 제품의 가격은 " + extra_product_info.get("price").getAsString() + "원 입니다.");
    System.out.println("고객님께서 조회하신 제품의 재질은 " + extra_product_info.get("qualityOfTheMaterial").getAsString() + "입니다.");


    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */
    JsonArray item_list = tShirtObject.getAsJsonArray("item_list");
    for (JsonElement jsonElement : item_list) {
      JsonObject tshirt = jsonElement.getAsJsonObject();
      System.out.println("고객님께서 조회하신 제품의 재고는 " + tshirt.get("TshirtStock").getAsInt() + "입니다.");
      System.out.println("고객님께서 조회하신 제품의 색상은 " + tshirt.get("TshirtColor").getAsString() + "입니다.");
    }
    System.out.println("======================================================");
  }

  public static void parseJsonDataUseIterator(JSONObject jsonObject) {
    System.out.println("====요기가 parseJsonDataUseIterator 메서드를 사용한 부분====");

    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */
    JsonParser jsonParser = new JsonParser();
    //JsonParser 객체는 JSON 데이터를 파싱하는 Java의 클래스.
    //Java에서는 JSON 데이터를 파싱하여 객체나 배열로 변환하기 위해 JsonParser 객체를 사용할 수 있음.

    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */
    String string = UtilJson.jsonToString(jsonObject);
    JsonElement tShirtInfo = JsonParser.parseString(string);// JsonParser를 사용하여 JSON 문자열을 파싱
    JsonObject tShirtObject = tShirtInfo.getAsJsonObject();// JsonElement를 JsonObject로 캐스팅

    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */
    System.out.println("고객님께서 조회하신 제품의 번호는 " + tShirtObject.get("product_no").getAsInt() + "입니다.");
    System.out.println("고객님께서 조회하신 제품의 명칭은 " + tShirtObject.get("product_name").getAsString() + "입니다.");

    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */
    JsonObject extra_product_info = tShirtObject.getAsJsonObject("extra_product_info");
    System.out.println("고객님께서 조회하신 제품의 사이즈는 " + extra_product_info.get("size").getAsInt() + "입니다.");
    System.out.println("고객님께서 조회하신 제품의 가격은 " + extra_product_info.get("price").getAsString() + "원 입니다.");
    System.out.println("고객님께서 조회하신 제품의 재질은 " + extra_product_info.get("qualityOfTheMaterial").getAsString() + "입니다.");

    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */
    JsonArray item_list = tShirtObject.getAsJsonArray("item_list");

    /**
     * item_list의 각 원소를 JSONObject로 캐스팅 후, 변수의 키셋을 가져온다.
     * [참고] 각 원소의 키가 다를 경우 유용하다.
     */
    for (JsonElement tshirtElement : item_list) {//// item_list 배열의 각 요소를 반복. 각 요소는 JsonElement 타입임
      JsonObject tshirtObject = tshirtElement.getAsJsonObject();// JsonElement인 tshirtElement JsonObject로 캐스팅.
      Set<String> keys = tshirtObject.keySet();//모든 키 가져오기
      Iterator<String> iterator = keys.iterator();//키 셋을 Iterator로 변환.

      while (iterator.hasNext()) {
        String key = iterator.next();//현재 키 읽어오기
        JsonElement value = tshirtObject.get(key);//읽어온 키에 대응하는 값을 value에 저장.
        JsonPrimitive primitiveValue = value.getAsJsonPrimitive();//Json의 기본 데이터 타입인 JsonPrimitive로 캐스팅.
        if (primitiveValue.isString()) {
          // 값이 문자열인 경우
          System.out.println("고객님께서 조회하신 제품의 색상은 " + primitiveValue.getAsString() + "입니다.");
        } else if (primitiveValue.isNumber()) {
          // 값이 숫자인 경우
          System.out.println("고객님께서 조회하신 제품의 재고는 " + primitiveValue.getAsInt() + "입니다.");
        }
      }
    }
    System.out.println("=====================================================");
  }

  public static String jsonToString(JSONObject jsonObject) {
    return jsonObject.toString();
  }
}