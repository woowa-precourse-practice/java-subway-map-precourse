package subway.system;

import subway.controller.ControllerHolder;

import java.util.HashMap;

public class FrontController {
    private final ControllerHolder controllerHolder = new ControllerHolder();

    public void run() {
        HashMap<String, Object> model = new HashMap<>();
        controllerHolder.get(ControllerName.SETUP).process(model);
    }
}
