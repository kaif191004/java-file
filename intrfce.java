/**
 * intrfce is same as abstraction only but in this we use implement thing unlike extends of abstaction
 */

/**
 * intrfce
 */
enum barbaadi {

    PENDING, SUCCESSFULL, FAILED;
} 

public class intrfce {

    public static void main(String[] args) {
        
        barbaadi obj = barbaadi.SUCCESSFULL;

 
    switch (obj) {

        case PENDING:
        System.out.println(" Barbaadi on the way");
      break;

      case SUCCESSFULL:
      System.out.println(" Barbaadi is succesfull");
      break;
    }
}
 }
