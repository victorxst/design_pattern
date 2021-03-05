package com.example.design_pattern.pattern.structural.decorator;

public class GradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("成绩单");
    }

    @Override
    public void sign(String name) {
        System.out.println("签名"+name);
    }
}
