package com.example.design_pattern.pattern.structural.proxy;

/**
 * 代理模式：为其它对象提供一种代理以控制对这个对象的访问。
 *
 * Subject:抽象主题类，可以是抽象类可以是接口，定义业务接口
 * RealSubject:具体主题类，也叫被委托角色、被代理角色，业务接口的具体实现
 * Proxy:代理主题类，也叫委托类、代理类。
 *
 * 优点：
 * 1、职责清晰
 * 2、高扩展性
 * 3、智能化
 *
 * 使用场景：
 * 为什么用代理？
 * 打官司为什么要找律师，因为你不想参与中间过程的是是非非，只要完成自己的答辩就行，
 * 其它的比如事前调查、事后追查都由律师来搞定，减轻你的负担。
 *
 * 扩展：
 * 1、静态代理（P
 * 2、强制代理（P
 * 3、动态代理（P
 */
public class test {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = new Proxy(subject);
        proxy.request();
    }
}
