package dev.pdmnhn.patterns.decorator.inputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
    public static void main(String[] args) {
        try (InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(new FileInputStream("./src/main/resources/test.txt")))) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
