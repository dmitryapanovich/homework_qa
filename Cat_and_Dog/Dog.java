public class Dog extends Animal {

    private int max_Run = 500;
    private int max_Swim = 10;
    private static int count;

    public Dog(String name, int swims, int run) {
        this.name = name;
        this.swim = swims;
        this.run = run;
        count++;
    }

    public static int getCount() {
        return count;
    }

}
