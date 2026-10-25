abstract class bhai{

    public void strong () {
        System.out.println("Bhai is strong");
    }

    abstract void pagal ();
    abstract void cute ();
}

class jaan extends bhai {
 public void pagal() {
    System.out.println("Mera bhai pagal hai");
 }
public void cute () {
    System.out.println("Mera bhai uncute hai");
}
}

class keeda extends bhai {
    public void pagal () {
        System.out.println("Nanga punga chutiya hu mai");
    }

    public void cute () {
        System.out.println("Galat bande ne coding seekh li");
    }


}


public class inhrtt {

    public static void main(String[] args) {
     bhai bol = new keeda(); 

     bol.pagal();
     bol.cute();
     
    }
}