import java.awt.*;

public class Circle extends Shape{

    private double raduis;

    public Circle(double raduis)
    {
        this.raduis=raduis;
    }

    public Circle(String color,double raduis){
        super(color);
        this.raduis=raduis;
    }

    @Override
    public double getArea() {
       return Math.PI*raduis*raduis;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*raduis;
    }

    public double getRaduis()
    {
        return raduis;
    }

    public void setReduis(double raduis)
    {
        this.raduis = raduis;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "reduis=" + raduis +
                '}';
    }

    @Override
    public void drowShape(Graphics g, int x, int y) {
        int dim = (int) (raduis*2);
        g.fillOval(x,y,dim,dim);
    }
}
