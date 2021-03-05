package com.example.design_pattern.pattern.creational.simplefactory;

/**
 * 简单工厂模式：不算入23种设计模式之中
 */
public class test {
    public static void main(String[] args) {
        //根据type返回对象
        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(null == video){
//            return;
//        }
//        video.produce();

        //根据class类返回对象
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(null == video){
            return;
        }
        video.produce();
    }
}
