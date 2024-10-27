class Employee {
    String name;
    int salary;

    public Employee (String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println(this.name);
        System.out.println(this.salary);

    }

}
class Maneger extends Employee{
    String department;

    public Maneger (String name, int salary,String department){
        super(name,salary);
        this.department=department;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println(this.department);
    }

}

public class Main {
    public static void main(String[] args) {
        Employee empl = new Employee("Alina",8000);
        Maneger mang = new Maneger("Giorgi", 1000, "IT");
        empl.displayDetails();
        mang.displayDetails();

    }
}

//Task5