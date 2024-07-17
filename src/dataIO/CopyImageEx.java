package dataIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyImageEx {

  public static void main(String[] args) throws IOException {
    String originalFileName = "/Users/zoohwan_99/Documents/티스토리/일상 사진/0714/goodmorning.jpeg";
    String targetFileName = "/Users/zoohwan_99/Documents/티스토리/일상 사진/0714/goodmorning_copy.jpeg";

    InputStream is = new FileInputStream(originalFileName);
    OutputStream os = new FileOutputStream(targetFileName);

//    byte[] buffer = new byte[1024];
//    while (true){
//      int data = is.read(buffer);
//      if (data == -1) break;
//      os.write(buffer,0,data);
//    }
    is.transferTo(os);//java 9부터 지원 : 입력스트림에서 출력스트림으로 바이트 복사 가능
    os.flush();
    os.close();
    is.close();
    System.out.println("copy complete");
  }
}
