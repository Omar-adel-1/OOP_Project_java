import java.awt.*;

public class Cube extends ThreeDShape {

    private double side;

    public Cube(double side)
    {
        this.side=side;
    }
    public Cube(String color,double side){
        super(color);
        this.side=side;
    }
    public double getSide()
    {

        return side;
    }

    public void setSide(double side)
    {

        this.side = side;
    }

    @Override
    public double getVolum()
    {
        return side * side * side;
    }

    @Override
    public double getArea()
    {
        return 6 * side * side;
    }

    @Override
    public double getPerimeter()
    {
        return 12 * side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }

    @Override
    public void drawShape(Graphics g, int x, int y) {
        if(this.side<=0)
        {
            System.err.println("Invalid side");
        }
        int side=(int)this.side;
        int offset =side / 3;

        g.drawRect(x,y,side,side);
        g.drawRect(x-offset,y-offset,side,side);

        g.drawLine(x,y,x-offset,y-offset);
        g.drawLine(x+side,y,x+side-offset,y-offset);
        g.drawLine(x,y+side,x-offset,y+side-offset);
        g.drawLine(x+side,y+side,x+side-offset,y+side-offset);
    }

}
