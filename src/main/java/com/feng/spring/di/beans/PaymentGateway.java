package com.feng.spring.di.beans;

public class PaymentGateway {

    private Order order;

    public void setOrder(Order ord){
        this.order = ord;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString(){
        return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
    }
}
