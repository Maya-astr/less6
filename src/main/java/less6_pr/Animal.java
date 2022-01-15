package less6_pr;

public abstract class Animal {
    private int run;
    private int swim;
    private String name;
    static int achieve = 0;

    public Animal() {
        achieve++;
    }

    public int getRun(){ return run;}
    public void setRun(int run){this.run = run;}

    public int getSwim(){ return swim;}
    public void setSwim(int run){this.run = swim;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public abstract void lengthRun(int met);
    public abstract void lengthSwim(int met);
    public abstract void lengthName(int name);


    }
