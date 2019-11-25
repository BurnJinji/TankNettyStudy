package com.burning8393.nettystudy.s04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientFrame extends Frame {
    TextArea ta = new TextArea();
    TextField tf = new TextField();

    public ClientFrame() throws HeadlessException {
        this.setSize(600, 400);
        this.setLocation(50, 20);
        this.add(ta, BorderLayout.CENTER);
        this.add(tf, BorderLayout.SOUTH);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText(ta.getText() + tf.getText());
                tf.setText("");
            }
        });

        this.setVisible(true);

        new Client().connect();
    }

    public static void main(String[] args) {
        new ClientFrame();
    }
}
