package subway.controller;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.inputview.InputView;
import subway.outputview.OutputView;
import subway.vo.StationCommand;

import java.util.Map;

public class DeletingStationController implements Controller {
    private final OutputView outputView;
    private final InputView<Station> inputView;

    public DeletingStationController(OutputView outputView, InputView<Station> inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    @Override
    public void process(Map<String, Object> model) {
        outputView.print(model);
        Station station = inputView.getInput(model);
        StationRepository.deleteStation(station);
    }
}
