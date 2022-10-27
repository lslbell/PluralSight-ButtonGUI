package swingWithSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class Button2Controller implements IButtonController, ActionListener {

    @Autowired
    private Window window;


//    public Button2Controller(Window window) {
//        this.window=window;
//    }

    public Button2Controller() {}


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button 2 was pressed!!");
    }

    @Override
    public void debugMethod() {
        System.out.println("From button 2!");
    }

    @Override
    public void setWindow(Window window) {
        this.window = window;
    }
}
