import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
public class app {
    
  public static void main(String[] args) {
    int aantal = 0;
    ArrayList<String> listx = new ArrayList<String>();
    ArrayList<String> listy = new ArrayList<String>();
    
    File myObj = new File("./input.txt");
    try{
    Scanner scanner = new Scanner(myObj);
    while (scanner.hasNextLine()) {
      String data = scanner.nextLine();
      listx.add(data.split("   ")[0]);
      listy.add(data.split("   ")[1]);
      }
    scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
    for (int i = 0; i < listx.size(); i++){
        int ver = 0;
        for (int j = 0; j < listx.size(); j++){
            if (listx.get(i).equals(listy.get(j))){
                ver++;
            }
        }
        int som = Integer.parseInt(listx.get(i)) * ver;
        aantal += som;
    }
    System.out.println(aantal);
    
  }
}

