package methodOverloading;

public class Customer {
    //method-1 to welcome the customer
    public static String welcomeCustomer(String userName){
        return "Hello,"+" "+userName+",welcome to DeltaTech.gg";
    }
    ////method-2 to welcome the customer
    public static String welcomeCustomer(String userName,int age){
        return "Hello,"+" "+userName+",welcome to DeltaTech.gg.You Have Been from"+" "+age+",in this year in this Body.";
    }
}
