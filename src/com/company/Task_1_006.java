package com.company;

import java.util.*;

public class Task_1_006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        ArrayList<Integer> b = new ArrayList<>();
// Input via ArrayList
            ArrayList<Integer> a = new ArrayList<>(Arrays.asList(-2,2,6,10,21,32,44));
// Input via Random
          /*  for (int i = 0; i < 20; i++) {
                a.add(r.nextInt((8 - 2) + 1) + 2);
           }*/
// Input via concole
       /* do {
            System.out.println("Enter positive number");
            while (!scan.hasNextInt()) {
                System.out.println("It is not an integer");
                scan.next();
            }
            len = scan.nextInt();
        } while (len <= 0);

       int n =0;
            do {
                System.out.println("Add positive item to Array");
                while (!scan.hasNextInt()) {
                    System.out.println("It is not an integer");
                    scan.next();
                }
                a.add(scan.nextInt());
                n++;
            } while (n < len);
*/

        System.out.println(a);
        for (int i = 1; i < a.size() - 1; i++) {
            if ((a.get(i) == ((a.get(i + 1) + a.get(i - 1))) / 2) && (((a.get(i + 1) + a.get(i - 1)) % 2) == 0)) {
                System.out.println("Number " + a.get(i));
                System.out.println("Position " + (i + 1));
            }
        }
    }
}




