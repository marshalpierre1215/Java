public class Main {
    public static void main(String[] args) {
        FoodMenu cooker1 = new ChinaCooker();
        Customer customer = new Customer(cooker1);//传入cooker1是为了避免空指针异常
        customer.order();
        FoodMenu cooker2 = new AmericCooker();
        Customer customer2 = new Customer(cooker2);
        customer2.order();
    }
}