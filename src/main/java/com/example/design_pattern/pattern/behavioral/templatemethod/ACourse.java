package com.example.design_pattern.pattern.behavioral.templatemethod;

public abstract class ACourse {
    //基本方法
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }
    final void makePPT(){
        System.out.println("制作PPT");
    }
    final void makeVideo(){
        System.out.println("制作Video");
    }
    final void writeArticle(){
        System.out.println("制作Article");
    }
    protected boolean needWriteArticle(){
        return false;
    }

    //模板方法
    abstract void packageCourse();
}
