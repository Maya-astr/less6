package less6_pr;

import less6.Animal;

public class Cat extends Animal {
    private static final int CatRace = 200;
    private static final int CatSwim = 0;


    @Override
    public  void  lengthRun(int met){
        if (met <= CatRace){
            System.out.println( "Кошка пробежал  " + met  +  "  метров");
        }
        else {
            System.out.println( "Кошка " +  met + "  метров не пробежит");
        }
    }
    @Override
    public  void  lengthSwim(int met){
        if (met >CatSwim){
            System.out.println( "Кошка потеряют одну из 9 жизней если поплывут...");
        }

    }
}
