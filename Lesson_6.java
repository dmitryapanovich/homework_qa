public class Lesson_6 {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",30000,30);
        persArray[1] = new Employee("Sergei Sergeev", "QA", "sesergeev@mailbox.com", "892312313",60000,35);
        persArray[2] = new Employee("Artem Artemov", "PM", "arartemov@mailbox.com", "892312314",70000,40);
        persArray[3] = new Employee("Boris Borisov", "HR", "boborisov@mailbox.com", "892312315",80000,45);
        persArray[4] = new Employee("Petr Petrov", "CEO", "pepetrov@mailbox.com", "892312316",90000,50);
        for (Employee value : persArray)
                System.out.println(value);

    }
}
