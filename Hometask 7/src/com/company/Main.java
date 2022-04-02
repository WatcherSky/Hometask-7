package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number");
            String name = scanner.next();
            
            String str = "5551-QWE-1231-www-1a2b";

            Checkstrclass.check(str);
            Checkstrclass.check2(str);
            Checkstrclass.check3(str);
            Checkstrclass.check4(str);
            Checkstrclass.check5(str);
            Checkstrclass.check6(str);
            Checkstrclass.check7(str);
        }
    }
}
