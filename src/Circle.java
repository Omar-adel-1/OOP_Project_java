import java.awt.*;

public class Circle extends Shape{

    private double radius;


    public Circle(double radius)
    {
        this.radius=radius;
    }

    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }

    @Override
    public double getArea() {
       return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "reduis=" + radius +
                '}';
    }

    @Override
    public void drawShape(Graphics g, int x, int y) {

        if(this.radius<=0)
        {
            System.err.println("Invalid radius");
        }
        int dim = (int) (radius*2);
        g.fillOval(x,y,dim,dim);
    }
}
