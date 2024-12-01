import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Collections; // Import the Scanner class to read text files
import java.util.Scanner;
public class app {
    
  public static void main(String[] args) {
    int diff = 0;
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
    Collections.sort(listx);
    Collections.sort(listy);
    for( int i = 0; i < listx.size(); i++){
        int ix = Integer.parseInt(listx.get(i));
        int iy = Integer.parseInt(listy.get(i));
        if (ix >= iy) diff += ix - iy;
        else diff += iy - ix;       
    }
    System.out.println(diff);
  }
}

