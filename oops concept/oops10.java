// meaning of static ibn oops java.

public class oops10{
    String name;
    int rno;
    double percent;

    private static int numberOfStudents;    

    //default constructor;

    public oops10(){     //here oops9 defines the Student or Student class


    }

    public oops10(String name, int rno, double percent){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        numberOfStudents++;

    }
    
    

    public static void main(String[] args){
        System.out.println(oops10.numberOfStudents);

        oops10 s1 = new oops10("sumit", 70, 98.6);
        System.out.println(s1.numberOfStudents);
        // ans is 1 without static and by usng static the ans is 1.

        oops10 s2 = new oops10("amit", 72, 95.6);
        System.out.println(s2.numberOfStudents);    
        // ans is 1 without static and by usng static the ans is 2.

        oops10 s3 = new oops10("sujit", 76, 92.6);
        System.out.println(s3.numberOfStudents); 
        // ans is 1 without static and by usng static the ans is 3.


    }
}