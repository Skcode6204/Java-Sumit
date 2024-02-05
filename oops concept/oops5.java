//getter and Setter.

class GetSet{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String N){
        this.name = N;
    }
}

public class oops5{
    public static void main(String[] args){
        GetSet obj = new GetSet();
        //setting the name by7 calling setter
        obj.setName("Sumit");
        //getting the name by calling getter.
        System.out.println(obj.getName());
    }
    

    
}