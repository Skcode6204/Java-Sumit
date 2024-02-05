// classes are pass by reference.

public class oops3{
    public static class Student{
        String name;
        String surname;
        int roll;
        double percentage;
    }
    
    public static void change(Student s){
        s.name = "Amit";
    }

    public static void main(String[] args){
        Student x = new Student();      //declaration of objects
        x.name = "Sumit";
        x.surname = "Kumar";
        int roll = 67;
        x.percentage = 90.7;
        System.out.println(x.name);         //pass by value
        change(x);
        System.out.println(x.name);       // pass by reference
    }
}