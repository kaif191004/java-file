class human{

    private String name;
    private int age;

    public int getage() {

    return age;

    }
    public void setage(int a)
    {

        age = a;
    }

    public String getname() {

    return name;
}

    public void setname(String k) {
        name = k;
    }
}
public class crazyy {

    public static void main(String[] args) {
        
        human obj = new human();
        obj.setname ("Kaif");
        obj.setage (23);

        System.out.println(obj.getage());
    }
}