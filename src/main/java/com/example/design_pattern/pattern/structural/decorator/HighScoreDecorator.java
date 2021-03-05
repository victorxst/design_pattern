package com.example.design_pattern.pattern.structural.decorator;

public class HighScoreDecorator extends Decoratr {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportHighScore(){
        System.out.println("考试分数");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
