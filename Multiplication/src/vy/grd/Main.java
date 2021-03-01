package vy.grd;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j<=10; j++){
                int a = i*j;
                System.out.print(a+" ");
                if (a<10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
