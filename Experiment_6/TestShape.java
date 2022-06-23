import java.util.*;
import java.lang.Math;
class Shape {
    Scanner sc = new Scanner(System.in);
    double area,perimeter;
    double radius,a,b,c,side;
    void getArea() {
        area = 0;   
    }
    void getPerimeter() {
        perimeter = 0;
    }
    void getSide() {
        side = 0;
    }    
}
class Circle extends Shape {
    void getArea() {
        area = Math.PI*radius*radius;   
    }
    void getPerimeter() {
        perimeter = 2*Math.PI*radius;
    }
    void getSide() {
        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }
}
class Triangle extends Shape {
    void getArea() {
        double s = (a+b+c)/2;
        area = s*(s-a)*(s-b)*(s-c);
        area = Math.sqrt(area);  
    }
    void getPerimeter() {
        perimeter = a+b+c;
    }
    void getSide() {
        System.out.println("Enter 3 sides of the triangle: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
    }
}
class Pentagon extends Shape{
    void getArea() {
        area =  5*(5+2*Math.sqrt(5));
        area = Math.sqrt(area);
        area = 0.25*area*side*side;
    }
    void getPerimeter() {
        perimeter = 5*side;
    }
    void getSide() {
        System.out.println("Enter side of the pentagon: ");
        side = sc.nextDouble();
    }
}
public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice,flag;
        while(true) {
            System.out.println("Select 1 Shape:\n1 -> Circle\n2 -> Triangle\n3 -> Pentagon");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    Circle c = new Circle();
                    c.getSide();
                    c.getPerimeter();
                    c.getArea();
                    System.out.printf("Perimeter of Circle: %.2f\nArea of circle: %.2f",c.perimeter,c.area);
                    break;
                case 2:
                    Triangle t = new Triangle();
                    t.getSide();
                    t.getPerimeter();
                    t.getArea();
                    System.out.printf("Perimeter of Triangle: %.2f\nArea of Triangle: %.2f",t.perimeter,t.area);
                    break;
                case 3:
                    Pentagon p = new Pentagon();
                    p.getSide();
                    p.getPerimeter();
                    p.getArea();
                    System.out.printf("Perimeter of Pentagon: %.2f\nArea of Pentagon: %.2f",p.perimeter,p.area);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            System.out.println("\nDo you want to continue?(yes=1/0=no)");
            flag = sc.nextInt();
            if(flag==0) {
                break;
            }
        }
        sc.close();
    }    
}