package org.example.innerClass;

public class Catering {
    public void order_1(){
        System.out.println("received  first order");
    }
    public void cancelOrder(){
        System.out.println("order Cancled");
    }
    public class Order{
        public String clintName;
        private int mobileNo;
        private String orderPreferance;

        public Order(String clintName, int mobileNo, String orderPreferance){
            this.clintName = clintName;
            this.orderPreferance = orderPreferance;
            this.mobileNo = mobileNo;

        }
        public void showOrderDetails(){
            System.out.println("Clint Name: " + clintName);
            System.out.println("Mobile no: " + mobileNo);
            System.out.println("Order Preferance: " + orderPreferance);
        }
    }
    // Main method to test
    public static void main(String[] args) {
        Catering catering = new Catering();
        catering.order_1();

        // Creating inner class object
        Catering.Order order = catering.new Order("Maya", 98765, "Vegetarian");
        order.showOrderDetails();

        catering.cancelOrder();
    }
}
