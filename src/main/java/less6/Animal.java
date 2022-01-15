package less6;

public abstract class Animal {
    private int run;
    private int swim;
    public static int achieve = 0;

    public Animal() {
        achieve++;
    }

    public int getRun(){ return run;}
    public void setRun(int run){this.run = run;}
    public int getSwim(){ return run;}
    public void setSwim(int run){this.run = swim;}
    public abstract void lengthRun(int met);
    public abstract void lengthSwim(int met);
    }
