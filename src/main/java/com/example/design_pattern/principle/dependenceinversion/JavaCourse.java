package com.example.design_pattern.principle.dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("用户在学习java");
    }
}
