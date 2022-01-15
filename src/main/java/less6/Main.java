package less6;

import java.net.SocketOption;

public class Main {

    public static void main(String[] args) {

        Cat catiMysy = new Cat();
        Cat catiPlysha = new Cat();



        catiMysy.lengthRun (150);
        catiMysy.lengthSwim (10);
        catiPlysha.lengthRun (20);
        catiPlysha.lengthSwim (0);


        Dog dogBob = new Dog();
        Dog dogRob = new Dog();
        Dog dogArch = new Dog();

        dogBob.lengthRun (300);
        dogBob.lengthSwim (10);
        dogRob.lengthRun (400);
        dogRob.lengthSwim (20);
        dogArch.lengthRun (200);
        dogArch.lengthSwim (15);


        System.out.println("Всего участвовало животных :  "+ Animal.achieve);
    }
}
