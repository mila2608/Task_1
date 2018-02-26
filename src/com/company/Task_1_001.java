package com.company;

import java.util.*;

public class Task_1_001 {

    public static void main(String[] args) {

        UserInvitation();
        OddEven();
        NoEqualNumbers();
        HappyTicket();

    }

    public static void UserInvitation() {
        Scanner scanner = new Scanner(System.in);
        String str, pattern;
        System.out.println("Enter your Name");
        str = scanner.nextLine();
        System.out.println("Hello " + str + "!");
        pattern = "123";
        if (str.equals(pattern))
            System.out.println(true);
        else
            System.out.println(false + "Enter 123 to match password");
    }

    public static void OddEven() {
        for (int i = 0; i < 5; i++) {
            int a = (int) (Math.random() * ((-20) - (-10)) + (-10));
        }
        Random r = new Random();
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            n.add(r.nextInt((10) - (1)) + (1));
            System.out.printf("%d ", n.get(i));
        }
        System.out.println();
        int sum = 0, pr = 1;
        for (int j = 0; j < n.size(); j++) {
            sum += n.get(j);
            pr = pr * n.get(j);
            if (n.get(j) % 2 == 0)
                even.add(n.get(j));
            else
                odd.add(n.get(j));
        }
        for (int k = 0; k < odd.size(); k++) {
            if (odd.get(k) % 3 == 0) System.out.println(odd.get(k) + " Number is 3 multiple");
            if (odd.get(k) % 9 == 0) System.out.println(odd.get(k) + " Number is 9 multiple");
            if (odd.get(k) % 5 == 0) System.out.println(odd.get(k) + " Number is 5 multiple");
            if (odd.get(k) % 7 == 0) System.out.println(odd.get(k) + " Number is 7 multiple");
        }
        System.out.println("Even numbers: ");
        System.out.println(even);
        System.out.println("Odd numbers: ");
        System.out.println(odd);
        System.out.println("Max value = " + Collections.max(n));
        System.out.println("Min value = " + Collections.min(n));
        System.out.println("Sum = " + sum);
        System.out.println("Multiplication = " + pr);
    }

    public static void NoEqualNumbers() {
        Random r = new Random();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        String str;
        for (int i = 0; i < 20; i++) {
            a.add(r.nextInt((999) - (100)) + (100));
            System.out.printf("%d ", a.get(i));
        }
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            str = a.get(i).toString();
            if ((str.charAt(0)) != (str.charAt(1)) && (str.charAt(1) != (str.charAt(2))) && ((str.charAt(0) != (str.charAt(2)))))
                System.out.println(str);
        }
    }

    public static void HappyTicket() {
        Random r = new Random();
        ArrayList<Integer> a = new ArrayList<>();
        String str;
        for (int i = 0; i < 100; i++) {
            a.add(r.nextInt((99999 - 0) + 1) + (99999));
            System.out.printf("%d ", a.get(i));
        }
        System.out.println();
        System.out.println("Happy tickets");
        for (int i = 0; i < a.size(); i++) {
            str = a.get(i).toString();

            if ((str.charAt(0) + str.charAt(1) + str.charAt(2)) == (str.charAt(3) + str.charAt(4) + str.charAt(5)))

                System.out.println(str);
        }
    }
}




