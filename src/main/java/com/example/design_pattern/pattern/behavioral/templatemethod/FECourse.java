package com.example.design_pattern.pattern.behavioral.templatemethod;

public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;
    @Override
    void packageCourse() {
        System.out.println("提供前端代码");
        System.out.println("提供素材");
    }

    public FECourse(boolean needWriteArticleFlag){
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
