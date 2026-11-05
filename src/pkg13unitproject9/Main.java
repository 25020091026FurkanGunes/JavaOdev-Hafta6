/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13unitproject9;

import java.util.ArrayList;
import java.util.Date;

// ==========================================
// 1. GeometricObject Sınıfı (Soyut Taban Sınıf)
// ==========================================
abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Oluşturulma tarihi: " + dateCreated + "\nRenk: " + color + " ve Dolu mu: " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

// ==========================================
// 2. Circle Sınıfı (GeometricObject & Comparable)
// ==========================================
class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius)
            return 1;
        else if (this.radius < o.radius)
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            return this.radius == ((Circle) o).radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nYarıçap: " + radius;
    }
}

// ==========================================
// 3. MyStack Sınıfı (Derin Kopyalama Yapan Yığın)
// ==========================================
class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public Object clone() {
        try {
            MyStack myStackClone = (MyStack) super.clone();
            myStackClone.list = (ArrayList<Object>) (list.clone());
            return myStackClone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}

// ==========================================
// 4. Main Sınıfı (Test Alanı)
// ==========================================
public class Main {
    public static void main(String[] args) {
        // --- Circle Testi ---
        System.out.println("=== CIRCLE TEST ===");
        Circle c1 = new Circle(5.0, "kırmızı", true);
        Circle c2 = new Circle(5.0, "mavi", false);
        Circle c3 = new Circle(8.0, "yeşil", true);

        System.out.println("c1 equals c2 (yarıçapları aynı): " + c1.equals(c2));
        System.out.println("c1 equals c3 (yarıçapları farklı): " + c1.equals(c3));
        System.out.println("c1.compareTo(c3) sonucu: " + c1.compareTo(c3));
        System.out.println("c3.compareTo(c1) sonucu: " + c3.compareTo(c1));

        // --- MyStack Testi ---
        System.out.println("\n=== MYSTACK DERİN KOPYALAMA TESTİ ===");
        MyStack stack1 = new MyStack();
        stack1.push("Java");
        stack1.push("C++");

        MyStack stack2 = (MyStack) stack1.clone();
        stack2.push("Python");

        System.out.println("Orijinal Yığın (stack1): " + stack1);
        System.out.println("Klonlanmış Yığın (stack2): " + stack2);
    }
}
