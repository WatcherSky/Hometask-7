package com.company;

public class Checkstrclass {


    public Object check;

    static void check(String param) {
        String check = param.substring(0, 4);
        String check2 = param.substring(9, 13);
        System.out.println(check);
        System.out.println(check2);
    }

    static void check2(String param) { //Тут конечно краш будет, если номер документа будет другим
        String getReplace = param.substring(5, 8);
        String getReplace2 = param.substring(14, 17);

        String get = param.replace(getReplace, "***");
        get.replace(getReplace2, "***");
        System.out.println(get);
    }

    static void check3(String param) {
        String str = param.replaceAll("[^a-zA-Z]", "");
        str.toLowerCase();
        System.out.println(str);

    }

    static void check4(String param) {
        String str = param.replaceAll("[^a-zA-Z]", "");
        StringBuilder builder = new StringBuilder();
        builder.append("Letters:");
        builder.append(str);
        System.out.println(builder);
    }

    static void check5(String param) { //
        String substring = "abc";
        String substring2 = "ABC";

        boolean isExist = param.contains(substring);
        boolean isExist2 = param.contains(substring2);

        if (isExist == true || isExist2 == true) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }

    }

    static void check6(String param) {
        if (param.startsWith("555")) {
            System.out.println("Начинается");
        } else {
            System.out.println("Не начинается");
        }
    }

    static void check7(String param) {

        if (param.endsWith("1a2b")) {
            System.out.println("Начинается");
        } else {
            System.out.println("Не начинается");
        }

    }
}