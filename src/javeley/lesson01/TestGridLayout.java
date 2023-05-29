package src.javeley.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestGridLayout {


    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout Demo");

        Button east = new Button("east");
        Button west = new Button("west");
        Button south = new Button("south");
        Button north = new Button("north");
        Button center = new Button("center");


        frame.setLayout( new GridLayout(3,2));
        frame.add(east);
        frame.add(west);
        frame.add(south);
        frame.add(north);
        frame.add(center);
        frame.add(center);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

//        自适应大小
//        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,400);


    }
}
