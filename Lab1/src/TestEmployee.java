public class TestEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "John", "Smith", 1000);
        System.out.println(employee1);
        System.out.println("Annual salary: " + employee1.getAnnualSalary());
        employee1.raiseSalary(40);
        System.out.println("New salary " + employee1.getSalary());
        System.out.println("New annual salary " + employee1.getAnnualSalary());
    }
}
