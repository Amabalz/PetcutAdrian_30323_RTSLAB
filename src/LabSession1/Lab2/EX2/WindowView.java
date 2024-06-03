package LabSession1.Lab2.EX2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WindowView extends JFrame implements Observer{
    private ArrayList<JProgressBar> bars = new ArrayList<JProgressBar>();

    public WindowView(int noThreads) {
        setLayout(null);
        setSize(450, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init(noThreads);
        this.setVisible(true);
    }

    private void init (int n) {
        for (int i = 0; i < n; i++){
            JProgressBar pb = new JProgressBar();
            pb.setMaximum(1000);
            pb.setBounds(50, (i+1)*30, 350, 20);
            this.add(pb);
            this.bars.add(pb);
        }
    }

    public void update(Observable o, Object arg){
        int id = ((FirModel)o).getId();
        int c = ((FirModel)o).getC();
        bars.get(id).setValue(c);
    }
}
