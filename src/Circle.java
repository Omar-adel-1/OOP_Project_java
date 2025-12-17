import java.awt.*;

public class Circle extends Shape{

    private double radius;
    private Color myColor;


    public Circle(double radius)
    {
        this.myColor = new Color((int)(Math.random() * 0x1000000));
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

    public void setRedius(double radius)
    {
        if(radius<=0)
        {
            System.err.println("Invalid radius");
        }
        else
        {
            this.radius = radius;
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "reduis=" + radius +
                '}';
    }

    @Override
    public void drawShape(Graphics g, int x, int y) {
        g.setColor(Color.gray);

        int dim = (int) (radius*2);
        g.fillOval(x,y,dim,dim);
    }
}
