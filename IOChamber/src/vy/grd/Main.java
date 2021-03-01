package vy.grd;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
            try{File file = new File(args[0]);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }}
        catch (FileNotFoundException|ArrayIndexOutOfBoundsException e){
            System.out.println("Файл не распознан. Введите ваши сообщения");
            ArrayList<String> list = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = " ";
            while (!s.equals("")){
                s= reader.readLine();
                list.add(s);
            }
            for (String str: list){
                System.out.println(str);
            }
        }
    }
}
