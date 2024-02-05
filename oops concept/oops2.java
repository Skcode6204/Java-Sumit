// passing class to function.

public class oops2{

    public static class Student{
        String name;
        String surname;
        int roll;
        double percentage;
    }
    public static void func(Student x){
        System.out.println(x.name);
        return;
    }
    public static void main(String[] args){
        Student x = new Student();      //declaration of objects
        x.name = "Sumit";
        x.surname = "Kumar";
        x.roll = 67;
        x.percentage = 90.7;
        //System.out.println(x.name);


        func(x);

        

    }
}