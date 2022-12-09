package subway.controller;

import subway.domain.*;

import java.util.List;
import java.util.Map;

public class SetupController implements Controller {
    @Override
    public void process(Map<String, Object> model) {
        saveStations();
        saveLines();
        initializeSections();
        saveMiddleStations();
    }

    private static void saveMiddleStations() {
        saveMiddleStationIn("2호선", "강남역");
        saveMiddleStationIn("3호선", "양재역");
        saveMiddleStationIn("3호선", "남부터미널역");
        saveMiddleStationIn("신분당선", "양재역");
    }

    private static void saveMiddleStationIn(String lineName, String stationName) {
        Section section = SectionRepository.findByLineName(lineName);
        section.addStation(1, stationName);
    }

    private void initializeSections() {
        saveSection("2호선", "교대역", "역삼역");
        saveSection("3호선", "교대역", "매봉역");
        saveSection("신분당선", "강남역", "양재시민의숲역");
    }

    private void saveSection(String lineName, String firstStationName, String lastStationName) {
        SectionRepository.addSection(
                LineRepository.findByName(lineName),
                StationRepository.findByName(firstStationName),
                StationRepository.findByName(lastStationName)
        );
    }

    private void saveLines() {
        for (String lineName : getLineNames()) {
            LineRepository.addLine(new Line(lineName));
        }
    }

    private static List<String> getLineNames() {
        return List.of("2호선", "3호선", "신분당선");
    }

    private static void saveStations() {
        for (String stationName : getStationNames()) {
            StationRepository.addStation(new Station(stationName));
        }
    }

    private static List<String> getStationNames() {
        return List.of("교대역", "강남역", "역삼역", "남부터미널역", "양재역", "양재시민의숲역", "매봉역");
    }
}
