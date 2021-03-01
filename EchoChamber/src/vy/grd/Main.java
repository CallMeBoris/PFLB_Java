package vy.grd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
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
