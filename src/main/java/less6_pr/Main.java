package less6_pr;

import less6_pr.Animal;
import less6_pr.Cat;
import less6_pr.Dog;

public class Main {


    public static void main(String[] args) {

        less6_pr.Cat catiMysy = new less6_pr.Cat();
        less6_pr.Cat catiPlysha = new less6_pr.Cat();
        less6_pr.Cat catiCha_Cha = new less6_pr.Cat();

        catiMysy.lengthRun (10);
        catiPlysha.lengthRun (12);
        catiCha_Cha.lengthRun (13);

        less6_pr.Dog dogBob = new less6_pr.Dog();
        less6_pr.Dog dogRob = new less6_pr.Dog();
        less6_pr.Dog dogArch = new less6_pr.Dog();

        dogBob.lengthRun (300);
        dogBob.lengthSwim (10);
        dogRob.lengthRun (400);
        dogRob.lengthSwim (20);
        dogArch.lengthRun (200);
        dogArch.lengthSwim (15);



        System.out.println(Animal.achieve);
    }
}
