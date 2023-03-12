public class Student{
    private String name, major;
    private double gpa;
    public Student(){
        name = "";
        major = "";
        gpa = 0;

    }
    public Student(String name, String major){
        super();
        this.name = name;
        this.major = major;
    }
    public Student(String name, String major, double gpa){
        this(name, major);
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public String toString(){
        return (getName()+" "+getMajor()+" "+getGpa());
    }
    public boolean equals(Student student){
        if(name == major)
            return true;
        else
            return false;
    }
}