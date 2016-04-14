package InputStreamerUpper;

import java.io.*;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        int c;
        try{
            InputStream in =
                    new UpperCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("File01.txt")));

            while ((c= in.read()) >=0){
                System.out.println((char)c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
