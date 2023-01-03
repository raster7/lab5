package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
    private int milan = 0;
    private int real = 0;
    String na = "N/A";
    String Real = "Real Madrid";
    String Milan = "AC Milan";
    String draw = "DRAW";
    private JButton bMilan= new JButton("AC Milan");
    private JButton bReal= new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: " + milan + " X " + real);
    private JLabel lastScorer = new JLabel("Last Scorer: " + na);
    private JLabel winner = new JLabel("Winner: " + draw);

    public GUI(){
        super("Match");
        this.setBounds(400, 200, 700,300);
        this.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
        Container cont = this.getContentPane();
        cont.setLayout(new GridLayout(2,3,100,2));
        cont.add(result);
        cont.add(lastScorer);
        cont.add(winner);
        bMilan.addActionListener(new ButtonEventListener());
        bReal.addActionListener(new ButtonEventListener());
        cont.add(bMilan);
        cont.add(bReal);
    }
    class ButtonEventListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bMilan) {
                milan++;
                result.setText("Result: " + milan + " X " + real);
                lastScorer.setText("Last Scorer: " + Milan);
            } else if (e.getSource() == bReal) {
                real++;
                result.setText("Result: " + milan + " X " + real);
                lastScorer.setText("Last Scorer: " + Real);
            }
            if (milan > real)
                winner.setText("Winner: " + Milan);
            else if (milan < real)
                winner.setText("Winner: " + Real);
            else
                winner.setText("Winner: " + draw);
        }
    }
}
