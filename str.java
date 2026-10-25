 class strongg {

    String model;
    String brand;
    static int Year;

    public void show() {
    System.out.println (model + " " + brand + " " + Year);
    }

    public static void show1(strongg obj) {
      System.out.println (obj.model + " " + obj.brand + " " + Year);

    }

}
 
 public class str{

    public static void main(String[] args) {
        
        strongg obj1 = new strongg();
        obj1.brand = "Kaif";
        obj1.model = "king";
        strongg.Year = 2004;



     strongg obj2 = new strongg();
        obj2.brand = "Somi";
        obj2.model = "king";
        strongg.Year = 2006;

        obj1.show();
        obj2.show();

        strongg.show1(obj2);



    }
   }
