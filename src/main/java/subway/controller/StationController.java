package subway.controller;

import subway.inputview.InputView;
import subway.outputview.OutputView;
import subway.vo.StationCommand;

import java.util.Map;

public class StationController implements Controller {
    private final OutputView outputView;
    private final InputView<StationCommand> inputView;

    public StationController(OutputView outputView, InputView<StationCommand> inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    @Override
    public void process(Map<String, Object> model) {
        outputView.print(model);
        StationCommand stationCommand = inputView.getInput(model);
        model.put("stationCommand", stationCommand);
    }
}
