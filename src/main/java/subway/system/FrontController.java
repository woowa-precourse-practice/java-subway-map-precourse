package subway.system;

import subway.controller.ControllerHolder;
import subway.vo.MainCommand;

import java.util.HashMap;
import java.util.Map;

public class FrontController {
    public void run() {
        HashMap<String, Object> model = new HashMap<>();
        saveSetupData(model);
        getMainCommand(model);

        MainCommand mainCommand = (MainCommand) model.get("mainCommand");
        doProcess(mainCommand, model);
    }

    private void doProcess(MainCommand mainCommand, Map<String, Object> model) {
        doStationProcess(mainCommand, model);
        doLineProcess(mainCommand, model);
        doSectionProcess(mainCommand, model);
        if (mainCommand == MainCommand.PRINT) {

        }
        if (mainCommand == MainCommand.QUIT) {

        }
    }

    private static void doSectionProcess(MainCommand mainCommand, Map<String, Object> model) {
        if (mainCommand == MainCommand.SECTION) {
            ControllerHolder.get(ControllerName.SECTION).process(model);
        }
    }

    private static void doLineProcess(MainCommand mainCommand, Map<String, Object> model) {
        if (mainCommand == MainCommand.LINE) {
            ControllerHolder.get(ControllerName.LINE).process(model);
        }
    }

    private void doStationProcess(MainCommand mainCommand, Map<String, Object> model) {
        if (mainCommand == MainCommand.STATION) {
            ControllerHolder.get(ControllerName.STATION).process(model);
        }
    }

    private void getMainCommand(HashMap<String, Object> model) {
        ControllerHolder.get(ControllerName.MAIN).process(model);
    }

    private void saveSetupData(HashMap<String, Object> model) {
        ControllerHolder.get(ControllerName.SETUP).process(model);
    }
}
