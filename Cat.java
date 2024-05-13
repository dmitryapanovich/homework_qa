public class Cat extends Animal {
    private static int count;

    public Cat(String name, int swims, int run) {
        this.name = name;
        this.swim = swims;
        this.run = run;
        count++;
    }

    public static int getCount() {
        return count;
    }

}
