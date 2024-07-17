package dataIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderEx01 {

  public static void main(String[] args) {
    try {
      FileInputStream fi = new FileInputStream("/Users/zoohwan_99/Documents/부트캠프/test1.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(fi));
      String line;
      while((line = br.readLine()) != null){
        System.out.println(line);
      }
      br.close();
      fi.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
