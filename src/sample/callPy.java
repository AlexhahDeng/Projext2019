package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class callPy {
    public static String getMessage() {
        // todo auto-generated method stub

        Process proc;
        String res = "";
        try {
            int a = 18;
            int b = 23;
            String[] args = new String[]{"python","F:\\demo.py",String.valueOf(a),String.valueOf(b)};
            proc = Runtime.getRuntime().exec(args); // exec py task
            //use input and output stream to get result
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while((line = in.readLine()) != null) {
                res = res + line;
            }
            in.close();
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return res;
    }

}
