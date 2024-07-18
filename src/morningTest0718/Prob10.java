package morningTest0718;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob10 {

  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("/Users/zoohwan_99/Documents/부트캠프/test1.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(fis));
      String line;
      int count = 0;
      while ((line = br.readLine()) != null){
        count++;
      }
      System.out.println(count);
      br.close();
      fis.close();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
