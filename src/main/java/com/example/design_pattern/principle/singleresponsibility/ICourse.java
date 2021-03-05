package com.example.design_pattern.principle.singleresponsibility;

public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
