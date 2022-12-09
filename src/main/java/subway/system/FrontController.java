package subway.system;

import subway.controller.ControllerHolder;

import java.util.HashMap;

public class FrontController {
    private final ControllerHolder controllerHolder = new ControllerHolder();

    public void run() {
        HashMap<String, Object> model = new HashMap<>();
        saveSetupData(model);
        controllerHolder.get(ControllerName.MAIN).process(model);
    }

    private void saveSetupData(HashMap<String, Object> model) {
        controllerHolder.get(ControllerName.SETUP).process(model);
    }
}
