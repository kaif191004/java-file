class mobile {
    String brand;
    String model;
    int yearoflaunch;

    void show () {
        System.out.println(brand + " " + model + " " + yearoflaunch);
    }

}

public class tiklu{

    public static void main(String[] args) {
        
        mobile obj1 = new mobile();
        obj1.brand = "Kaif";
        obj1.model = "king";
        obj1.yearoflaunch = 2004;



     mobile obj2 = new mobile();
        obj2.brand = "Somi";
        obj2.model = "king";
        obj2.yearoflaunch = 2006;

        obj1.show();
        obj2.show();


    
}
}