
import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private Drawable[] shapes;

    private final int SPACE = 100;
    private final int ROW_HEIGHT = 200;
    private final int MAX_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;

    public Panel(Drawable[] shapes) {
        this.shapes = shapes;
        setBackground(Color.WHITE);

        calculatePanelSize();
    }

    private void calculatePanelSize() {
        int xAxes = 50;
        int topPadding = 100;
        int bottomPadding = 200;

        int yAxes = topPadding;

        int currentWidth = 0;
        int currentHeight = yAxes + 200;

        for (Drawable shape : shapes) {
            if (shape != null) {
                int shapeSize = getShapeSize(shape);

                if (xAxes + shapeSize > 1000) {
                    xAxes = 50;
                    yAxes += 200 + 50;
                    currentHeight = yAxes + 200;
                }

                xAxes += shapeSize + 50;

                if (xAxes > currentWidth) {
                    currentWidth = xAxes;
                }
            }
        }


        int finalWidth = Math.max(currentWidth, 800);

        int finalHeight = Math.max(currentHeight + bottomPadding, 600);

        setPreferredSize(new Dimension(finalWidth, finalHeight));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xAxes = SPACE;
        int yAxes = 100;

        int currentPanelWidth = getWidth();

        for (Drawable shape : shapes) {
            if (shape != null) {
                int shapeSize = getShapeSize(shape);

                if (xAxes + shapeSize > currentPanelWidth) {
                    xAxes = SPACE;
                    yAxes += ROW_HEIGHT + SPACE;
                }

                int yOffset = (ROW_HEIGHT - shapeSize) / 2;

                shape.drawShape(g, xAxes, yAxes + yOffset);

                xAxes += shapeSize + SPACE;
            }
        }
    }

    private int getShapeSize(Drawable shape) {
        if (shape instanceof Circle) {
            return (int) (((Circle) shape).getRadius() * 2);
        } else if (shape instanceof Cube) {
            return (int) ((Cube) shape).getSide();
        } else {
            return 100;
        }
    }
}