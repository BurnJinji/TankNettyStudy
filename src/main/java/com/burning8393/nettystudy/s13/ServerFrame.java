package com.burning8393.nettystudy.s13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ServerFrame extends Frame {

    public static final ServerFrame INSTANCE = new ServerFrame();
    Server server = new Server();

    Button btnStart = new Button("start");
    TextArea taLeft = new TextArea();
    TextArea taRight = new TextArea();

    private ServerFrame() throws HeadlessException {
        this.setSize(1600, 600);
        this.setLocation(300, 10);
        this.add(btnStart, BorderLayout.NORTH);
        Panel panel = new Panel(new GridLayout(1, 2));
        panel.add(taLeft);
        panel.add(taRight);
        this.add(panel);

        taLeft.setFont(new Font("verderna", Font.PLAIN, 25));
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        ServerFrame.INSTANCE.setVisible(true);
        ServerFrame.INSTANCE.server.serverStart();
    }

    public void updateServerMsg(String string) {
        this.taLeft.setText(taLeft.getText() + System.getProperty("line.separator") + string);
    }

    public void updateClientMsg(String string) {
        this.taRight.setText(taRight.getText() + System.getProperty("line.separator") + string);
    }
}
