package org.example.UpperToLower;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String [] args) throws IOException {
        int c;
        try {
            LowerCaseInputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\Muratali\\Desktop\\mura.txt")));
            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
