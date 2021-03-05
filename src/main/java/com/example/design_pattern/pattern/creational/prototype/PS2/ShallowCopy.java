package com.example.design_pattern.pattern.creational.prototype.PS2;

import java.util.ArrayList;

public class ShallowCopy implements Cloneable{
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ShallowCopy shallowCopy = null;
        shallowCopy = (ShallowCopy) super.clone();
        return shallowCopy;
    }

    public void setVlue(String value){
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}
