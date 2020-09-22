package mirea;

import java.awt.*;
import javax.swing.*;

class Main extends JFrame
{
    int milanScore = 0;
    int madridScore = 0;

    JButton btn1 = new JButton("AC Milan");
    JButton btn2 = new JButton("Real Madrid");

    JLabel text1 = new JLabel("Result: 0 X 0");
    JLabel text2 = new JLabel("Last Scorer: N/A");
    Label text3 = new Label("Winner: N/A");

    void printResults()
    {
        text1.setText(String.format("Result: %d X %d", milanScore, madridScore ));

        if (milanScore > madridScore) text3.setText("Winner: AC Milan");
        if (milanScore == madridScore) text3.setText("Draw");
        else text3.setText("Winner: Real Madrid");
    }
    public Main() {
        super("PRAKTICA4");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setSize(120, 400);
        setLayout(new FlowLayout());

        add(btn1);
        btn1.setBackground(Color.green);
        add(btn2);
        btn2.setBackground(Color.red);

        add(text1);
        add(text2);
        add(text3);

        btn1.addActionListener(ae -> {
            milanScore++;
            text2.setText("Last Scorer: AC Milan");

            printResults();
        });

        btn2.addActionListener(ae -> {
            madridScore++;
            text2.setText("Last Scorer: Real Madrid");

            printResults();
        });
    }

        public static void main(String[] args)
        {
            new Main().setVisible(true);
        }
}

