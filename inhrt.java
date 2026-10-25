class takla {
    String name;
    int age;
   public void bhadwa(){
    System.out.println("Takla is done");

   }
}
 class chutiyapa extends takla {

    public void kuttakKamina() {

        System.out.println ("Taklas are chutiyas");
    }
}


public class inhrt {
    public static void main(String[] args) {

    chutiyapa okk = new chutiyapa();
    okk.bhadwa();
    okk.kuttakKamina();
    
}
}