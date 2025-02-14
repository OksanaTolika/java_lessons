public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fio, String position, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String[] getInfo() {
        String[] info = {
                "Fio: " + fio,
                "Position: " + position,
                "Email: " + email,
                "Phone: " + phone,
                "Salary: " + salary,
                "Age: " + age
        };
        return info;
    }

    public int getAge() {
        return age;
    }

}
