package lamda.day3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
  private String id;
  private String name;

  public Member(String id) {
    this.id = id;
  }
}
