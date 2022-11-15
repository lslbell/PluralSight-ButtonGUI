package swingWithSpring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import swingWithSpring.Window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
@Primary
public class Button1Controller implements IButtonController, ActionListener {

    @Autowired
    private Window window;


//    public Button1Controller(Window window) {
//        this.window=window;
//    }

    public Button1Controller() {}

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button 1 was pressed!!");
    }

    @Override
    public void debugMethod() {
        System.out.println("From button 1!");
    }

    @Override
    public void setWindow(Window window) {
        this.window = window;
    }

}
