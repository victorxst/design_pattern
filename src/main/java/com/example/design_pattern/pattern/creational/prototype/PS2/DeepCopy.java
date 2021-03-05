package com.example.design_pattern.pattern.creational.prototype.PS2;

import java.util.ArrayList;

public class DeepCopy implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopy deepCopy = null;
        deepCopy = (DeepCopy) super.clone();
        deepCopy.arrayList = (ArrayList<String>) this.arrayList.clone();
        return deepCopy;
    }

    public void setVlue(String value){
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}
