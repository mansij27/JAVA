import java.io.File;

public class GatherFileInfo {

    public static void main(String[] args) {
        File f = new File("E:/MyFile.txt");
        if (f.exists()) {
            System.out.println("Name: " + f.getName());
            System.out.println("Path: " + f.getAbsolutePath());
            System.out.println("Size: " + f.length());
            System.out.println("Writeable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
        } else {
            System.out.println("The File does not exist");
        }
    }

}
