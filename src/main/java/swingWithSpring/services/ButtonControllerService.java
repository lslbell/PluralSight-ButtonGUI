package swingWithSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swingWithSpring.controllers.IButtonController;

@Service
public class ButtonControllerService {

    private IButtonController controller;

    @Autowired
    public void setController(IButtonController controller) {
        this.controller = controller;
    }

    public IButtonController getController() {
        return controller;
    }
}
