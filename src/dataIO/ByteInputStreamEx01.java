package dataIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteInputStreamEx01 {

  public static void main(String[] args) {
    try {
      InputStream inputStream1 = new FileInputStream("/Users/zoohwan_99/Documents/부트캠프/test1.txt");
      InputStream inputStream2 = new FileInputStream("/Users/zoohwan_99/Documents/부트캠프/test2.txt");

      byte[] dataBytes = new byte[1024];

      while(true){
        int data = inputStream2.read(dataBytes);
        if (data == -1) break;
        for (int i = 0; i < data; i++) {
          System.out.println(dataBytes[i]);
        }
      }
      inputStream1.close();
      inputStream2.close();

    } catch (FileNotFoundException e) {
      System.out.println("해당 경로에 파일이 존재하지 않습니다.");
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}
