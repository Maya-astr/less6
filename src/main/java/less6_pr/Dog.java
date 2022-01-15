package less6_pr;

import less6.Animal;

public class Dog extends Animal {
    private static final int DogRace = 500;
    private static final int DogDrif = 10;

    @Override
    public  void  lengthRun(int met){
        if (met <= DogRace){
            System.out.println( "Собака  пробежала  " + met  +  "  метров");
        }
        else {
            System.out.println( "Собака " +  met + "  метров не пробежит");
        }
    }
    @Override
    public  void  lengthSwim (int met){
        if (met <=DogDrif){
            System.out.println( "Собака проплыла  "+  met + "  метров");
        } else {
            System.out.println( "Собака не проплывет  "+  met + "  метров");
        }
    }
}