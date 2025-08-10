package advancedPOO;

public class Employee {
    
    protected String name;
    protected double wage;


    public Employee( String name, double wage ){
        this.name = name;
        this.wage = wage;
    }

    public void displayEmployee() {
        System.out.println("O funcionario " + name + " tem salário de " + "R$ " + wage);
    }

    public double calculateSalary() {
        return wage * .1;
    }
}
