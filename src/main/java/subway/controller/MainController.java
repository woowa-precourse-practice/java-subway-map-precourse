package subway.controller;

import subway.inputview.InputView;
import subway.outputview.OutputView;
import subway.vo.MainCommand;

import java.util.Map;

public class MainController implements Controller {
    private final InputView<MainCommand> inputView;
    private final OutputView outputView;

    public MainController(InputView<MainCommand> inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    @Override
    public void process(Map<String, Object> model) {
        outputView.print(model);

        MainCommand mainCommand = inputView.getInput(model);
        model.put("mainCommand", mainCommand);
    }
}
