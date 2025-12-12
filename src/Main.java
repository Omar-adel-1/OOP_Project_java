import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.*;
import java.lang.Math.*;
import java.util.*;

public  class Main {
   private static Drawable[] shapes;
    public static void main(String[] args)
    {
       try {
           File readFromFile=new File("input.txt");
           Scanner in = new Scanner(readFromFile);

           PrintWriter printWriter = new PrintWriter("sumAreas.txt");
           printWriter.print("Summmmm Of Areas = ");

           double sum=0;

           int sizeOfShape=in.nextInt();
           shapes=new Drawable[sizeOfShape];

           for(int i=0;i<sizeOfShape;i++){
               String typeOfShape=in.next();
               double value =in.nextDouble();

               if(typeOfShape.equals("circle"))
               {
                   shapes[i]=new Circle(value);
                   sum+=((Shape) shapes[i]).getArea();
               }
               else if(typeOfShape.equals("cube"))
               {
                   shapes[i]=new Cube(value);
                   sum+=((Shape) shapes[i]).getArea();
               }
               else
               {
                   System.err.println("Invalid shape !");
                   i--;
               }

           }

           printWriter.println(sum);
           printWriter.close();

           userInterface(shapes);

       }catch (Exception e){
           System.err.println(e.getMessage());
       }

    }

    public static void userInterface(Drawable[] shape) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new BorderLayout());
        frame.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel(" Omar`s OOP Project !");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);

        Panel panel = new Panel(shape);

        JScrollPane scrollPane = new JScrollPane(panel);

        scrollPane.getVerticalScrollBar().setUnitIncrement(20);

        scrollPane.setBorder(BorderFactory.createEmptyBorder());

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}