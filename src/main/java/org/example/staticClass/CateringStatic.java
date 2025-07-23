package org.example.staticClass;

import org.example.innerClass.Catering;

public class CateringStatic {
    public void order_1() {
        System.out.println("received first order");
    }

    public void cancelOrder() {
        System.out.println("order cancelled");
    }
    //Static neste class
    public static class Order{
        public String clientName;
        private int mobileNo;
        private String orderPreference;

        public Order(String clientName, int mobileNo, String orderPreference){
            this.clientName = clientName;
            this.orderPreference = orderPreference;
            this.mobileNo = mobileNo;
        }
        public void showOrderDetails(){
            System.out.println("Client Name: " + clientName);
            System.out.println("Mobile no: " + mobileNo);
            System.out.println("Order Preference:" + orderPreference);
        }
    }
    public  static void main(String[] args){
        CateringStatic catering = new CateringStatic();
        catering.order_1();

        CateringStatic.Order order = new CateringStatic.Order("maya", 78979, "veg");
        order.showOrderDetails();

        catering.cancelOrder();
    }

}
