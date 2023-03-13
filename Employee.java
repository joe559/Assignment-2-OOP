public class Employee {
    private String name;
    private int hours;
    public double getHours(){
        return this.hours;
    }

    public Employee(String name, int hours){
        this.name = name;
        this.hours = hours;
    }
    public double calculateSalary(){
        return this.hours*20;
    }
}
