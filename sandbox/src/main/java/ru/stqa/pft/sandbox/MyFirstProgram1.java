package ru.stqa.pft.sandbox;

public class MyFirstProgram1 {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Marina");

        square s = new square(5);
        System.out.println(("Площадь квадрата со стороной " + s.l + " = " + s.area()));

       Rectangle r= new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами "+ r.a + " и "+ r.b + " = " + r.area());
    }

    public static void hello(String somebody) {

        System.out.println("Hello " + somebody + "!");
    }



}
