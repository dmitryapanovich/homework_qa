public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public void setValue(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void getValue() {
        System.out.println("Name: " + name + "Position: " + position + "Email: " + email + "Phone: " + phone + "Salary: " + salary + "Age: " + age);
    }
}
