package swingWithSpring;

import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public interface IButtonController {

    public void actionPerformed(ActionEvent e);

    public void debugMethod();

    void setWindow(Window window);
}
