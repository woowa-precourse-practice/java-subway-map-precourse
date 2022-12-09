package subway.controller;

import subway.inputview.InputView;
import subway.outputview.OutputView;
import subway.system.ControllerName;
import subway.vo.LineCommand;
import subway.vo.StationCommand;

import java.util.Map;

public class LineController implements Controller {
    private final OutputView outputView;
    private final InputView<LineCommand> inputView;

    public LineController(OutputView outputView, InputView<LineCommand> inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    @Override
    public void process(Map<String, Object> model) {
        outputView.print(model);
        LineCommand lineCommand = inputView.getInput(model);
        saveLine(model, lineCommand);
        deleteLine(model, lineCommand);
        if (lineCommand == LineCommand.FIND) {
            ControllerHolder.get(ControllerName.LINE_FIND).process(model);
        }
    }

    private static void deleteLine(Map<String, Object> model, LineCommand lineCommand) {
        if (lineCommand == LineCommand.DELETE) {
            ControllerHolder.get(ControllerName.LINE_DELETE).process(model);
        }
    }

    private static void saveLine(Map<String, Object> model, LineCommand lineCommand) {
        if (lineCommand == LineCommand.SAVE) {
            ControllerHolder.get(ControllerName.LINE_SAVE).process(model);
        }
    }
}
