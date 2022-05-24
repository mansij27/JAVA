// importing the File class
import java.io.File;

class Directory {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("C:/Users/MANSI JAIN/ProjectDjango/C programs");

    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}