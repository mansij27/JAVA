	import java.io.FileWriter;
	import java.io.IOException;
	public class AppendToFile {
    public static void main(String[] args) {
	        String fileName = "E:/MyFile.txt";
	        String str = "\nAppending to existing file";
        try {
            FileWriter fw = new FileWriter(fileName, true);
	            fw.write(str);
	            fw.close();
	        } catch (IOException e) {
	            System.out.println("Error in writing to file");
	        }
	    }
	}
