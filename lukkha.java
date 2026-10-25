 class Cong {

    public int add (int n1, int n2)
    {
    int result = n1 + n2;
return result;

 }

 public double add (int n1, double n2)
 {
    double result= n1 + n2;
return result;
 }

 }

public class lukkha {

    public static void main(String[] args) {
        Cong obj = new Cong();
        double r1 = obj.add(78, 92);
        System.err.println(r1);
    }
}
