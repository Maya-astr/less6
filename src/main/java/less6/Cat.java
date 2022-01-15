package less6;

public class Cat extends Animal {
    private static final int CatRace = 100;

    @Override
    public  void  lengthRun(int met){
        if (met <= CatRace){
            System.out.println( "Кошка пробежала  " + met  +  "  метров");
        }
        else {
            System.out.println( "Кошка " +  met + "  метров не пробежит");
        }
    }
    @Override
    public  void  lengthSwim (int met){
        System.out.println( "Кошки потеряют одну из 9 жизней если их заставить плыть");
    }
}
