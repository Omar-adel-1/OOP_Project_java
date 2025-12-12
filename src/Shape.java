import java.util.Date;

public abstract class Shape implements Drawable {

    private Date dateCreated;
    private String color;

    @Override
    public String howToDrwa()
    {
        return "";
    }

    public Shape(){}
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
