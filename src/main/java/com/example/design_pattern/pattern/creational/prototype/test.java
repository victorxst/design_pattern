package com.example.design_pattern.pattern.creational.prototype;

/**
 * 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 原型模式主要就是将类进行克隆，克隆之后，操作互不影响。
 *
 * 优点：（P142）
 * 1、是在内存二进制流的拷贝，要比直接new一个对象性能好很多
 * 2、直接在内存中拷贝，构造函数不会被执行，既是缺点也是优点（减少约束）
 *
 * 缺点：
 * 1、直接在内存中拷贝，构造函数不会被执行，既是缺点也是优点（减少约束）
 *
 * 使用场景（P142）
 * 1、类初始化需要消耗非常多的资源，包括数据、硬件资源
 * 2、通过new产生一个对象需要非常繁琐的数据准备或访问权限
 * 3、一个对象需要提供给其他对象访问，而且各个调用者都有可能对这个对象进行修改。
 * 4、原型模式一般与工厂方法模式一块使用。
 *
 * PS：
 * 1、构造函数不被执行：示例（PS1)
 * 2、深拷贝和浅拷贝：示例（PS2)
 * 3、clone与final是有冲突的
 */
public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail："+mail);
        for(int i=0;i<10;i++){
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress(i+"@imooc.com");
            mailTemp.setContent("中奖了");
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
