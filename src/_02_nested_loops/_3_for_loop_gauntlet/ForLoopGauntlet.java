package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
    public static void main(String[] args) {
        //All numbers from 0 to 100
        for(int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        //All numbers from 100 to 0
        for(int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
        //All even numbers from 2 to 100
        for(int i = 2; i <= 100; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
        //All odd numbers from 1 to 99
        for(int i = 1; i <= 99; i++) {
            if(i%2 == 1) {
                System.out.println(i);
            }
        }
        //All numbers from 1 to 100, labeled even or odd
        for(int i = 1; i <= 500; i++) {
            if(i%2 == 0) {
                System.out.println("" + i + " even");
            } else {
                System.out.println("" + i + " odd");
            }
        }
        //All multiples of 7 from 0 to 777
        for(int i = 0; i <= 777; i++) {
            if(i%7 == 0) {
                System.out.println(i);
            }
        }
        //Every year I was alive and how old I was (casually leaks age and year of birth)
        for(int i = 2010; i <= 2025; i++) {
            System.out.println("In " + i + ", I was " + (i - 2010) + " years old.");
        }
        //000102101112202122
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("" + i + " " + j);
            }
        }
        //123456789 in box
        for(int i = 0; i < 3; i++) {
            System.out.println();
            for(int j = 1; j <= 3; j++) {
                System.out.print(i*3 + j);
                System.out.print(" ");
            }
        }
        //1-100 in box
        for(int i = 0; i < 10; i++) {
            System.out.println();
            for(int j = 1; j <= 10; j++) {
                System.out.print(i*10 + j);
                System.out.print(" ");
            }
        }

        for(int i = 0; i < 7; i++) {
            System.out.println();
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
        }
    }
}