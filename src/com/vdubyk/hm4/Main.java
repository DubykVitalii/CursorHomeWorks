package com.vdubyk.hm4;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> myListInt = new MyList<>();
        myListInt.add(25);
        myListInt.add(10);
        myListInt.add(55);
        myListInt.add(-20);
        myListInt.add(30);


        System.out.println(myListInt.toString());
        System.out.println(myListInt.highest());
        System.out.println(myListInt.lowest());


        MyList<String> myListStr = new MyList<>();
        myListStr.add("CCC");
        myListStr.add("AAA");
        myListStr.add("FFF");
        myListStr.add("DDD");
        myListStr.add("BBB");

        System.out.println(myListStr.toString());
        System.out.println(myListStr.highest());
        System.out.println(myListStr.lowest());

        MyList<Character> myListChar = new MyList<>();
        myListChar.add('d');
        myListChar.add('a');
        myListChar.add('z');
        myListChar.add('c');
        myListChar.add('f');

        System.out.println(myListChar.toString());
        System.out.println(myListChar.highest());
        System.out.println(myListChar.lowest());

    }
}
