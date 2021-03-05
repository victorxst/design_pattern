package com.example.design_pattern;

public class test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.show(a);
        a.show(b);
        b.show(c);
        b.show(d);
        A ba = new B();
        ba.show(c);
        ba.show(d);
        ba.show(a);
    }
}
class A{
    public void show(A obj){
        System.out.println("a.show(a)");
    }
    public void show(C obj){
        System.out.println("a.show(c)");
    }
}
class B extends A{
    @Override
    public void show(A obj) {
        System.out.println("b.show(a)");
    }
}
class C extends B{}
class D extends C{

}
