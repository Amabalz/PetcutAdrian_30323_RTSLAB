package LabSession1.Lab2.EX3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WindowView extends JFrame implements Observer{

    private ArrayList<Rectangle> figures = new ArrayList<Rectangle>();

    public WindowView() {
        setLayout(null);
        setSize(450, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        setVisible(true);
    }

    private void init () {

        Rectangle rectangle1 = new Rectangle(10, 10, 50, 50);
        Rectangle rectangle2 = new Rectangle(170, 10, 50, 50);
        Rectangle rectangle3 = new Rectangle(330, 10, 50, 50);

        JPanel mainPanel = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);

                g.drawRect(rectangle1.x, rectangle1.y, rectangle1.width, rectangle1.height);
                g.drawRect(rectangle2.x, rectangle2.y, rectangle2.width, rectangle2.height);
                g.drawRect(rectangle3.x, rectangle3.y, rectangle3.width, rectangle3.height);
            }
        };

        figures.add(rectangle1);
        figures.add(rectangle2);
        figures.add(rectangle3);

        setContentPane(mainPanel);
    }

    public void update(Observable o, Object arg){
        int id = ((FirModel)o).getId();
        int y = ((FirModel)o).getYCoordinate();
        Rectangle rectangle = figures.get(id);

        rectangle.y = y;
        repaint();
    }

    public int getFrameHeight(){
        return getHeight();
    }
}
