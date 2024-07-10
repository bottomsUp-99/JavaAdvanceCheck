package collectionEx.list;

public class ArrayEx01 {

  public static void main(String[] args) {
    Integer data_list[][] = {{1,2,3}, {4,5,6}};
    System.out.println(data_list[0][1]);
    System.out.println(data_list[1][1]);

    Integer[][][] data_list1 = {
        {
            {1, 2, 3},
            {4, 5, 6}
        },
        {
            {7, 8, 9},
            {10, 11, 12}
        }
    };
    System.out.println(data_list1[0][1][1]);
    System.out.println(data_list1[1][1][2]);

    String dataset[] = {
        "Braund, Mr. Owen Harris",
        "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
        "Heikkinen, Miss. Laina",
        "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
        "Allen, Mr. William Henry",
        "Moran, Mr. James",
        "McCarthy, Mr. Timothy J",
        "Palsson, Master. Gosta Leonard",
        "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
        "Nasser, Mrs. Nicholas (Adele Achem)",
        "Sandstrom, Miss. Marguerite Rut",
        "Bonnell, Miss. Elizabeth",
        "Saundercock, Mr. William Henry",
        "Andersson, Mr. Anders Johan",
        "Vestrom, Miss. Hulda Amanda Adolfina",
        "Hewlett, Mrs. (Mary D Kingcome) ",
        "Rice, Master. Eugene",
        "Williams, Mr. Charles Eugene",
        "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
        "Masselmani, Mrs. Fatima",
        "Fynney, Mr. Joseph J",
        "Beesley, Mr. Lawrence",
        "McGowan, Miss. Anna",
        "Sloper, Mr. William Thompson",
        "Palsson, Miss. Torborg Danira",
        "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
        "Emir, Mr. Farred Chehab",
        "Fortune, Mr. Charles Alexander",
        "Dwyer, Miss. Ellen",
        "Todoroff, Mr. Lalio"
    };

    int count = 0;
    for (String s : dataset){
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'M') {
          count++;
          break;
        }
      }
    }
    System.out.println(count);

    int num = 0;
    for (int i = 0; i < dataset.length; i++) {
      if (dataset[i].indexOf("M") >= 0){
        num++;
      }
    }
    System.out.println(num);

    int number = 0;
    for (String s : dataset){
      if (s.indexOf("M") >= 0){
        number++;
      }
    }
    System.out.println(number);
  }
}