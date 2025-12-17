import java.awt.*;
import java.util.Date;

public abstract class Shape implements Drawable {

    private Date dateCreated;
    private String color;

    @Override
    public String howToDraw()
    {
        return "";
    }

    public Shape(){
        this.dateCreated =new Date();
        this.color = "red";
    }
    public Shape(String color)
    {
        this.color = color;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
