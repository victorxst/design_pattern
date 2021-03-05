package com.example.design_pattern.principle.openclose;

public class javaDiscountCourse extends JavaCourse {

    public javaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    public Double getOriginPrice(){
        return super.getPrice();
    }
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
