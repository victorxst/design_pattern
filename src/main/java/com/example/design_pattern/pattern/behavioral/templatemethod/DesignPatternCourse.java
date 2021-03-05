package com.example.design_pattern.pattern.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程源码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
