package swingWithSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import swingWithSpring.controllers.Button2Controller;
import swingWithSpring.controllers.IButtonController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component("myWindow")
public class Window {

    IButtonController controller;
    Button2Controller button2Controller;

    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JButton button2;


    public Window() {

        createFrame();
        createPanel();
        addLayoutObject();

        buttonAddActionSpringWay(controller, button2Controller);

        setSize();
        addToPanel();

    }

    @Autowired
    public void buttonAddActionSpringWay(IButtonController controller, Button2Controller button2Controller) {
        button1.addActionListener((ActionListener) controller);
        button2.addActionListener(button2Controller);
    }

    public void addToPanel() {
        panel.add(button1);
        panel.add(button2);
    }

    public void addLayoutObject() {
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");

    }

    public void buttonAddActionEasyWay() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 pressed!");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 pressed!");
            }
        });
    }

    public void createFrame() {
        frame = new JFrame("Window");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void createPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
    }

    public void setSize() {
        button1.setBounds(100,200,100,100);
        button2.setBounds(250, 200, 100, 100);
    }

    public void printController() {
        System.out.println(controller);
    }

}
