package main;

import clase.Autobuz;
import clase.AutobuzBuiler;

public class Program {
    public static void main(String[] args) {
        AutobuzBuiler autobuzBuiler = new AutobuzBuiler();
        autobuzBuiler.setTextRulat("la").setOraIncepereProgram(9);

        Autobuz a1 = autobuzBuiler.build();

        autobuzBuiler.setTextRulat("ro").setOraIncepereProgram(6);

        Autobuz a2 = autobuzBuiler.build();

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
