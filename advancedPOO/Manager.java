package advancedPOO;

public class Manager extends Employee {
    
    private double bonusAdd;

    public Manager( String name, double wage, double bonusAdd) {
        super(name, wage); 
        this.bonusAdd = bonusAdd;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + this.bonusAdd;
    }
}
