package com.ariel;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // *****************************************
        // Time1
        // *****************************************

        Time1 a1 = new Time1(13, 45);
        Time1 a2 = new Time1(13, 45);
        Time1 a3 = new Time1(a2);

        System.out.println("object a1=>"+a1.toString());
        System.out.println("object a2=>"+a2.toString());
        System.out.println("object a3=>"+a3.toString());
        System.out.println("############get###########");
        System.out.println("a1: "+a1.getHour()+" hours");
        System.out.println("a1: "+a1.getMinute()+" minute");
        System.out.println("a2: "+a2.getHour()+" hours");
        System.out.println("a2: "+a2.getMinute()+" minute");
        System.out.println("a3: "+a3.getHour()+" hours");
        System.out.println("a3: "+a3.getMinute()+" minute");
        System.out.println("###########equal############");
        System.out.println("is a1 equal a2?"+a1.equals(a2));
        System.out.println("is a2 equal a3?"+a2.equals(a3));
        System.out.println("###########setHour############");
        System.out.println("a1.setHour(900)");
        a1.setHour(900);
        System.out.println("a1:"+a1.getHour()+" hours");
        System.out.println("a1.setHour(17)");
        a1.setHour(17);
        System.out.println("a1:"+a1.getHour()+" hours");
        System.out.println("###########setMinute############");
        System.out.println("a1.setMinute(60)");
        a1.setMinute(60);
        System.out.println("a1:"+a1.getMinute()+" minute");
        System.out.println("a1.setMinute(17)");
        a1.setMinute(17);
        System.out.println("a1:"+a1.getMinute()+" minute");
        System.out.println("###########midnight############");
        System.out.println("minute from midnight for a1: "+a1.minFromMidnight());
        System.out.println("minute from midnight for a2: "+a2.minFromMidnight());
        System.out.println("minute from midnight for a3: "+a3.minFromMidnight());
        System.out.println("###########before############");

        System.out.println("is a1 before a2? " + " " + a1.before(a2));
        System.out.println("is a2 before a1? " + " " + a2.before(a1));
        System.out.println("is a2 before a3? " + " " + a2.before(a3));
        System.out.println("###########after############");
        System.out.println("is a1 after a2? " + " " + a1.after(a2));
        System.out.println("is a2 after a1? " + " " + a2.after(a1));
        System.out.println("is a2 after a3? " + " " + a2.after(a3));
        System.out.println("###########difference############");

        System.out.println("the difference between a1 and a2: " + a1.difference(a2));
        System.out.println("the difference between a2 and a3: " + a2.difference(a3));
    }
}