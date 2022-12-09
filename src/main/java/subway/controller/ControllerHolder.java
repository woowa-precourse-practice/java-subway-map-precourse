package subway.controller;

import subway.inputview.InputViewHolder;
import subway.inputview.InputViewName;
import subway.outputview.OutputViewHolder;
import subway.outputview.OutputViewName;
import subway.system.ControllerName;

import java.util.HashMap;
import java.util.Map;

public class ControllerHolder {
    private final Map<ControllerName, Controller> controllers = new HashMap<>();

    public ControllerHolder() {
        controllers.put(ControllerName.SETUP, new SetupController());
        controllers.put(ControllerName.MAIN, new MainController(
                InputViewHolder.get(InputViewName.MAIN),
                OutputViewHolder.get(OutputViewName.MAIN)
        ));
    }

    public Controller get(ControllerName controllerName) {
        return controllers.get(controllerName);
    }
}
