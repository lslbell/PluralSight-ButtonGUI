package swingWithSpring.controllers;

import org.springframework.stereotype.Component;
import swingWithSpring.Window;

import java.awt.event.ActionEvent;

@Component
public interface IButtonController {

    public void actionPerformed(ActionEvent e);

    public void debugMethod();

    void setWindow(Window window);
}
