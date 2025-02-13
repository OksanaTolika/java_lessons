public class Employee {
    private String fio;
    private String jobTitle;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fio, String jobTitle, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("<---Print employee--->");
        System.out.println("Fio: " + fio);
        System.out.println("JobTitle: " + jobTitle);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("<--------------------->\n");
    }

    public int getAge() {
        return age;
    }

}
