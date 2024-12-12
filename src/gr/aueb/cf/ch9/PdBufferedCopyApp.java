package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdBufferedCopyApp {

    public static void main(String[] args) {
        int b;
        int counter =0;
        long start;
        long end;
        double elapsedTime = 0.0;
        byte[] buffer = new byte[8192]; // 8KB

        try (FileInputStream fis = new FileInputStream("C:/Users/thomas/Desktop/tmp/dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:/Users/thomas/Desktop/tmp/dummy-out.pdf")){

            start = System.currentTimeMillis();
            while ((b = fis.read(buffer)) != -1){
                fos.write(buffer , 0, b);
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("Το αρχειο με μεγεθος %1fKB (%d bytes) αντιγραφηκε επιτυχως \n",
                    (counter / 1024.0) , counter );

            System.out.println("Elapsed time: " + elapsedTime + " seconds");


        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
