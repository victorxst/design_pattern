package com.example.design_pattern.pattern.structural.decorator;

public class SortDecorator extends Decoratr {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportSort(){
        System.out.println("排名");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
