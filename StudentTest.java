public class StudentTest{
    public static void main(String[] args) {
            Student john =  new Student("John","CS",3.5);
            Student Mary = new Student();
            Mary.setName("Mary Ann");
            Mary.setMajor("CE");
            Mary.setGpa(3.3);
            System.out.println(john.toString());
            System.out.println(Mary.toString());
    }
}