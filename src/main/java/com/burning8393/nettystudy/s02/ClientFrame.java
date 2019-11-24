package com.burning8393.nettystudy.s02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientFrame extends Frame {
    TextArea ta = new TextArea();
    TextField tf = new TextField();

    public ClientFrame() {
        this.setSize(600, 400);
        this.setLocation(200, 50);
        this.add(ta, BorderLayout.CENTER);
        this.add(ta, BorderLayout.SOUTH);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText(ta.getText() + tf.getText());
                tf.setText("");
            }
        });
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ClientFrame();
    }
}
