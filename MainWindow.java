package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 23.02.2017.
 */
public class MainWindow extends JFrame {
     MainWindow(String s){
        JButton btn = new JButton("Упорядкування");
        SquareSpawn square = new SquareSpawn();
        add(btn, BorderLayout.NORTH);
        add(square);
        setSize(500,500);
        setLocationRelativeTo(null);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                square.changePosition();
                repaint();
            }
        });
    }
}
