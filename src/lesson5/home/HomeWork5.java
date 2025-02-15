public class HomeWork5 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович",
                "Тестировщик",
                "ivanov@test.ru",
                "8-999-999-99-99",
                120500.65,
                43);

        employees[1] = new Employee("Петров Петр Петрович",
                "Разработчик",
                "ivanov@test.ru",
                "8-999-999-99-99",
                130060.77,
                40);

        employees[2] = new Employee("Захаров Захар Захарович",
                "Аналитик",
                "ivanov@test.ru",
                "8-999-999-99-99",
                125001.95,
                41);

        employees[3] = new Employee("Александров Александр Александрович",
                "Тестировщик",
                "ivanov@test.ru",
                "8-999-999-99-99",
                130030.11,
                45);

        employees[4] = new Employee("Дмитриев Дмитрий Дмитриевич",
                "Разработчик",
                "ivanov@test.ru",
                "8-999-999-99-99",
                140600.00,
                38);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println("<---Print employee--->");
                System.out.println(employees[i].getInfo());
                System.out.println("<-------------------->\n");
            }
        }
    }
}
