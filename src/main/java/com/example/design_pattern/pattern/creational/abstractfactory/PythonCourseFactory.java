package com.example.design_pattern.pattern.creational.abstractfactory;

public class PythonCourseFactory extends CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
