class Gobi {

    private int age;
    private String name;

   
    public Gobi( int a, String n) //Using paremetrized constructor
    {
        age = a;
        name = n;
    }

    public int getage() {
     return age;
    }

     public String getname() {

      return name;

     }

     public void setAge(int age) {
        this.age = age;

     }

     public void setname(String name) {
        this.name = name;
     }
   
}

public class encap {  
public static void main(String[] args) {

  
    Gobi tobi1 = new Gobi(22, "Kaif"); //calling constructor for work
    System.out.println(tobi1.getname() + " " + tobi1.getage());

}

}

