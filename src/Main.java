import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
ArrayList<String> A=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String a= scanner.next();
            A.add(a);
        }
        System.out.println("Список А:"+A);
        ArrayList<String>B=new ArrayList<>();
        for (int l = 0; l < 5; l++) {
            String b=scanner.next();
            B.add(b);
        }
        System.out.println("Список B: "+B);

        ArrayList<String>C=new ArrayList<>();
        for (int i = 0; i <5; i++) {
          C.add(A.get(i));
          C.add(B.get(4-i));

        }
        System.out.println("Список С заполненный по порядку A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1: "+C);
        Collections.sort(C,new Sort());
        System.out.println("Список С отсортированный по длинне слов : "+C);

    }
}