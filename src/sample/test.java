package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class test {
    public static void main(String[] args) {
        // System.out.println("hellp?");
        callTarget tmp = new callTarget();
        tmp.runProgram();
    }
}

class callTarget {
    public static void runProgram() {

        Process pro;

        try {
            String[] args = new String[]{"python","F:\\创新创业项目组\\BreastSegment\\massSegment.py"};

            String[] args2 = new String[]{"notepad.exe"};

            pro = Runtime.getRuntime().exec(args);

            BufferedReader readerIn = new BufferedReader(new InputStreamReader(pro.getInputStream(),"gbk"));
            // BufferedReader readerOut = new BufferedReader(new Output(pro.getOutputStream(),"gbk"));
            BufferedReader readerError = new BufferedReader(new InputStreamReader(pro.getErrorStream(),"gbk"));

            String line = null;

            System.out.println("here is the output");

            while ((line = readerIn.readLine()) != null) {

                System.out.println(line);

            }

            System.out.println("here is the error info");

            while ((line = readerError.readLine()) != null) {

                System.out.println(line);
            }

            int exitVal = pro.waitFor();

            System.out.println("Process exitValue: " + exitVal);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
