package subway.inputview;

import subway.domain.Station;

import java.util.Map;

public class StationInfoInputView implements InputView<Station> {
    @Override
    public Station getInput(Map<String, Object> model) {
        String input = readInput();
        return new Station(input);
    }
}
