//

public class oopsFraction11{
    public static Fraction add(Fraction f1, Fraction f2){
        int numerator = f1.num*f2.den + f2.num*f1.den;
        int denominator = f1.den*f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }

    //make function for greatest common divisor (gcd).
    public static int gcd(int num, int den){
        int min = Math.min(num, den);
        for(int i=min; i>=1; i--){
            if(num%i == 0 && den%i == 0) return i;
        }
        return min;
    }

    //make class.
    public static class Fraction{
        int num;
        int den;

        //make constructor.
        public Fraction(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }

        //make simplify function.
        public void simplify(){
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }
    }
    public static void main(String[] args){
        Fraction f1 = new Fraction(35, 21);
        System.out.println(f1.num+"/"+f1.den);
        Fraction f2 = new Fraction(7, 3);
        System.out.println(f2.num+"/"+f2.den);
        Fraction f3 = add(f1, f2);
        System.out.println(f3.num+"/"+f3.den);
    }


}