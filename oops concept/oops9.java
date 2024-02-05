// meaning of static in oops java.

public class oops9{
    String name;
    int rno;
    double percent;

    static int numberOfStudents;    

    //default constructor;

    public oops9(){     //here oops9 defines the Student or Student class


    }

    public oops9(String name, int rno, double percent){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        numberOfStudents++;

    }

    public static void main(String[] args){
        oops9 s1 = new oops9("sumit", 70, 98.6);
        System.out.println(s1.numberOfStudents);
        // ans is 1 without static and by usng static the ans is 1.

        oops9 s2 = new oops9("amit", 72, 95.6);
        System.out.println(s2.numberOfStudents);    
        // ans is 1 without static and by usng static the ans is 2.

       /*  oops9 s3 = new oops9("sujit", 76, 92.6);
        System.out.println(s3.numberOfStudents); 
        // ans is 1 without static and by usng static the ans is 3.



       /* oops9 s1 = new oops9("sumit", 70, 98.6);
        oops9 s2 = new oops9("amit", 72, 95.6);
        oops9 s3 = new oops9("sujit", 76, 92.6);
        System.out.println(s1.numberOfStudents);
        System.out.println(s2.numberOfStudents);
        System.out.println(s3.numberOfStudents);*/
        //here the ans is 3, 3, 3. due to shared property by static.


    }
}