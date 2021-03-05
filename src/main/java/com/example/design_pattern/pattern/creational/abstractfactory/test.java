package com.example.design_pattern.pattern.creational.abstractfactory;

import com.example.design_pattern.principle.demeter.Course;

/**
 * 抽象工厂模式：为创建一组相关或相互依赖的对象提供一个接口，而且无须指定他们的具体类。
 *
 * 抽象工厂模式包含的角色：
 * 抽象产品类（AbstractProduct)：Video.java/Article.java
 * 产品实现类（Product）：JavaArticle.java/PythonArticle.java,JavaVideo.java/PythonVideo.java
 * 抽象工厂类（AbstractCreator）：CourseFactory.java
 * 实现工厂类（Creator）：JavaCourseFactory.java/PythonCourseFactory.java
 *
 * 优点：封装性，每个产品的实现不是高层模块关心的。
 *      产品族内的约束为非公开状态。例如：Article其中方法内的约束条件是不对外公开的。
 * 缺点：产品族增加困难（产品族就是Article/Video)。例如：再新增一个其他产品族，
 * 就需要改动CourseFactory、javaCourseFactory/PythonCourseFactory等工厂类，改动比较大。
 *
 * 使用场景：例如：linux下的文本编辑器和windows下的文本编辑器，页面相同、功能相同、业务逻辑相同，但是代码不同，就可以
 * 使用抽象工厂模式，产生不同环境下的文本编辑器。
 *
 */
public class test {
    public static void main(String[] args) {
//        CourseFactory courseFactory = new JavaCourseFactory();
//        Video video = courseFactory.getVideo();
//        Article article = courseFactory.getArticle();
//        video.produce();
//        article.produce();

        CourseFactory courseFactory = new PythonCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
