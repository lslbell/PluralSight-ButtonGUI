package swingWithSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
