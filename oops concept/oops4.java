//Access Modifiers --> public private and default.

public class Student{
    String name;
    double percent;
    private int roll;       //this show private access in output

    
}

public class oops4{
    

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Sumit Kumar";
        s1.percent = 98.7;
        s1.roll = 67;

        System.out.println(s1.roll());
        



    }
}