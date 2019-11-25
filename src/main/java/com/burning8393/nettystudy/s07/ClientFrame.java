package com.burning8393.nettystudy.s07;

import java.awt.*;

public class ClientFrame extends Frame {
    public final static ClientFrame INSTANCE = new ClientFrame();
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
//            ta.setText(ta.getText() + System.getProperty("line.separator") +  tf.getText());
            tf.setText("");
        });


    }

    public void connectToServer() {
        client = new Client();
        client.connect();
    }

    public void updateText(String acceptMsg) {
        this.ta.setText(ta.getText() + System.getProperty("line.separator") + acceptMsg);
    }

    public static void main(String[] args) {
        ClientFrame frame = ClientFrame.INSTANCE;
        frame.setVisible(true);
        frame.connectToServer();
    }
}
