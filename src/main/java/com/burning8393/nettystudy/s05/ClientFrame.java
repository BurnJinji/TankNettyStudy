package com.burning8393.nettystudy.s05;

import java.awt.*;

public class ClientFrame extends Frame {
    TextArea ta = new TextArea();
    TextField tf = new TextField();

    Client client = null;
    public ClientFrame() throws HeadlessException {
        this.setSize(600, 400);
        this.setLocation(50, 20);
        this.add(ta, BorderLayout.CENTER);
        this.add(tf, BorderLayout.SOUTH);

        tf.addActionListener(e -> {
            client.send(tf.getText());
            ta.setText(ta.getText() + tf.getText());
            tf.setText("");
        });

        this.setVisible(true);
        connectToServer();
    }

    public void connectToServer() {
        client = new Client();
        client.connect();
    }

    public static void main(String[] args) {
        new ClientFrame();
    }


}
