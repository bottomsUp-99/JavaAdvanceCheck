package json.gson;

import java.util.List;
import lombok.Data;

@Data
public class UserInfo {

  private String num;
  private String name;
  private List<String> roles;

}
