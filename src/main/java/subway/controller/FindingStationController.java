package subway.controller;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.inputview.InputView;
import subway.outputview.OutputView;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindingStationController implements Controller {
    private final OutputView outputView;

    public FindingStationController(OutputView outputView) {
        this.outputView = outputView;
    }

    @Override
    public void process(Map<String, Object> model) {
        List<String> stationNames = getStationNames();
        model.put("stationNames", stationNames);
        outputView.print(model);
    }

    private static List<String> getStationNames() {
        List<String> stationNames = StationRepository.stations()
                .stream().map(Station::getName)
                .collect(Collectors.toList());
        return stationNames;
    }
}
