package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by User on 22.02.2017.
 */
public class SquareSpawn extends JPanel {

    int x, N = 5, check = 0;
    int order[] = new int[N];
    Random random = new Random();

    public void paint(Graphics g){
        x=50;
        for (int i = 0; i < N; i++, x+=50){
            if (check==0){
                order[i] =  random.nextInt(200)+50;
            }
            Color color = new Color(order[i]-30,order[i]-30,order[i]-30);
            g.setColor(color);
            g.fillRect(x,495 - order[i],50,order[i]);
        }
    }

    void changePosition(){
        int saveNumb;
        check = 1;
        for (int j = 0; j < (N-1); j++){
            for (int i = 0; i < (N-1); i++) {
                if (order[i] > order[i + 1]) {
                    saveNumb = order[i];
                    order[i] = order[i + 1];
                    order[i + 1] = saveNumb;
                }
            }
        }
    }

}
