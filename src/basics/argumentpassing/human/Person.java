package basics.argumentpassing.human;

import basics.argumentpassing.animal.Deer;

public class Person {
    public static void main(String[] args) {
        Lang ap;
        for(Lang a:Lang.values()) {
            System.out.println(a+" "+a.getCoders()+" coders.");
        }
    }
}

enum Lang {
    Python(10),
    Java(9),
    Angu(12);

    private int coders;

    Lang(int coders) {
        this.coders = coders;
    }

    int getCoders(){
        return coders;
    }
}
