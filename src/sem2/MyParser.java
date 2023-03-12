package sem2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class MyParser {

    public static void main(String[] args) throws IOException {
        String filePath = "myFile.txt";
        HashMap<String, String> map = new HashMap<String, String>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line = reader.readLine();
        String[] parts = line.split("[:,]");
        System.out.println(Arrays.toString(parts));

        StringBuilder sb = new StringBuilder();
        sb.append("Студент ");
        sb.append(parts[1]);
        sb.append(" получил ");
        sb.append(parts[3]);
        sb.append(" по предмету ");
        sb.append(parts[5]);

        System.out.println(sb);
    }
}
