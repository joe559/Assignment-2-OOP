public class Professor extends Employee{
    private String field;
    public Professor(String name, int hours,String field){
        super(name,hours);
        this.field=field;
    }
    public double calculateSalary(){
        return this.getHours()*30;
    }

    
}
