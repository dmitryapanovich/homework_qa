public class Animal {
    private final int max_Run = 0;
    private final int max_Swim = 0;
    protected String name;
    protected int swim;
    protected int run;
    private static int count;


    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return "Nickname: '" + name + "\': " +
                " Can swim: " + swim + "м. " +
                ", Can run: " + run + "м. ";
    }

    protected void run(int distance) {
        if ((run >= distance) && (run <= max_Run)){
            System.out.println("Nickname " + this.name + "  - пробежал " + distance + "м.");
        } else {
            System.out.println("Nickname " + this.name + " - не пробежал ");
        }
    }

    protected void swim(int distance) {
        if ((swim >= distance) && (swim <= max_Swim)) {
            System.out.println("Nickname " + this.name + "   - проплыл " + distance + "м.");
        } else {
            System.out.println("Nickname " + this.name + " - не проплыл ");
        }
    }
}
