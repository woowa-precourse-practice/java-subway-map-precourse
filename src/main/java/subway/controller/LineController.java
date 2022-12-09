package subway.controller;

import subway.inputview.InputView;
import subway.outputview.OutputView;
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
    }
}
