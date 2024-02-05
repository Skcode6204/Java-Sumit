public class oops1{
    //creating a new data type
    public static class Student{
        String name;
        String surname;
        int roll;
        double percentage;
    }
    public static void main(String[] args){
        Student x = new Student();      //declaration
        x.name = "Sumit";
        x.surname = "Kumar";
        x.roll = 67;
        x.percentage = 90.7;
        System.out.println(x.roll);

        Student s = new Student();
        s.name = "Sujeet";
        s.surname = "Kumar";
        x.roll = 43;
        System.out.println(s.name);

    }
}