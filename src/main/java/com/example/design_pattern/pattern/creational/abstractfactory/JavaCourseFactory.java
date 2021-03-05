package com.example.design_pattern.pattern.creational.abstractfactory;

public class JavaCourseFactory extends CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
