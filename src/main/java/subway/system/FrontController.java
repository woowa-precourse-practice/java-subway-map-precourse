package subway.system;

import subway.controller.ControllerHolder;
import subway.vo.MainCommand;

import java.util.HashMap;
import java.util.Map;

public class FrontController {
    private final ControllerHolder controllerHolder = new ControllerHolder();

    public void run() {
        HashMap<String, Object> model = new HashMap<>();
        saveSetupData(model);
        getMainCommand(model);

        MainCommand mainCommand = (MainCommand) model.get("mainCommand");
        doProcess(mainCommand, model);
    }

    private void doProcess(MainCommand mainCommand, Map<String, Object> model) {
        if (mainCommand == MainCommand.STATION) {
            controllerHolder.get(ControllerName.STATION).process(model);
        }
        if (mainCommand == MainCommand.LINE) {

        }
        if (mainCommand == MainCommand.SECTION) {

        }
        if (mainCommand == MainCommand.PRINT) {

        }
        if (mainCommand == MainCommand.QUIT) {

        }
    }

    private void getMainCommand(HashMap<String, Object> model) {
        controllerHolder.get(ControllerName.MAIN).process(model);
    }

    private void saveSetupData(HashMap<String, Object> model) {
        controllerHolder.get(ControllerName.SETUP).process(model);
    }
}
