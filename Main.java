public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Murchik", 0, 250);
        animals[1] = new Cat("Murka", 0, 350);
        animals[2] = new Dog("Bobik", 5, 550);
        animals[3] = new Dog("Margo", 12, 200);

        System.out.println("Characteristics of the animals:");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        System.out.println("Total cats: " + (Cat.getCount()));
        System.out.println("Total dogs: " + (Dog.getCount()));
        System.out.println("Total animals: " + Animal.getCount());
        System.out.println("Skills: ");
        System.out.println("Running: ");

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
        }

        System.out.println("Swimming: ");

        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(10);
        }

    }
}