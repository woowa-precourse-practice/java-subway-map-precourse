package subway.controller;

import subway.system.ControllerName;

import java.util.HashMap;
import java.util.Map;

public class ControllerHolder {
    private final Map<ControllerName, Controller> controllers = new HashMap<>();

    public ControllerHolder() {
        controllers.put(ControllerName.SETUP, new SetupController());
    }

    public Controller get(ControllerName controllerName) {
        return controllers.get(controllerName);
    }
}
