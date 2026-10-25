public class mrexcptn {

    public static void main(String[] args) {
        int a = 16;
        int b = 0;     
    

    int nums [] = new int[6];


    try{
    System.out.println(nums[7]);
}

    catch (ArithmeticException e) {
    System.out.println("There is a fish");
}

catch (Exception e) {
System.out.println("Something fishy");
}
}
}
