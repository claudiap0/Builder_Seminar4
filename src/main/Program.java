package main;

import clase.Autobuz;
import clase.AutobuzBuiler;

public class Program {
    public static void main(String[] args) {
        AutobuzBuiler autobuzBuiler = new AutobuzBuiler();
        autobuzBuiler.setNumeSofer("Dorel").setDeschideUsile(false);

        Autobuz autobuz = autobuzBuiler.build();

        Autobuz autobuz1 = new AutobuzBuiler().setNumeSofer("Bobita").setNrLinie(3).build();

        System.out.println(autobuz);
        System.out.println(autobuz1);
    }
}
