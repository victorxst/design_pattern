package com.example.design_pattern.pattern.structural.decorator;

public abstract class Decoratr extends SchoolReport {
    private SchoolReport st;
    public Decoratr(SchoolReport sr){
        this.st = sr;
    }

    @Override
    public void report() {
        this.st.report();
    }

    @Override
    public void sign(String name) {
        this.st.sign(name);
    }
}
