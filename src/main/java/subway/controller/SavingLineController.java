package subway.controller;

import subway.domain.*;
import subway.inputview.InputViewHolder;
import subway.inputview.InputViewName;
import subway.outputview.OutputViewHolder;
import subway.outputview.OutputViewName;

import java.util.Map;

public class SavingLineController implements Controller {

    public static final String NOT_EXISTING_STATION = "존재하지 않는 역 이름";
    public static final String ALREADY_EXISTING_LINE = "이미 존재하는 노선 이름";

    @Override
    public void process(Map<String, Object> model) {
        String lineName = getLineName(model);
        Station firstStation = getFirstStation(model);
        Station lastStation = getLastStation(model);

        Line line = new Line(lineName);
        LineRepository.addLine(line);
        SectionRepository.addSection(line, firstStation, lastStation);
    }

    private static Station getLastStation(Map<String, Object> model) {
        OutputViewHolder.get(OutputViewName.LINE_SAVE_LAST_STATION).print(model);
        Station lastStation = (Station) InputViewHolder.get(InputViewName.STATION_INFO).getInput(model);
        if (!StationRepository.isExisting(lastStation)) {
            throw new IllegalArgumentException(NOT_EXISTING_STATION);
        }
        return lastStation;
    }

    private static Station getFirstStation(Map<String, Object> model) {
        OutputViewHolder.get(OutputViewName.LINE_SAVE_FIRST_STATION).print(model);
        Station firstStation = (Station) InputViewHolder.get(InputViewName.STATION_INFO).getInput(model);
        if (!StationRepository.isExisting(firstStation)) {
            throw new IllegalArgumentException(NOT_EXISTING_STATION);
        }
        return firstStation;
    }

    private static String getLineName(Map<String, Object> model) {
        OutputViewHolder.get(OutputViewName.LINE_SAVE).print(model);
        String lineName = (String) InputViewHolder.get(InputViewName.LINE_NAME).getInput(model);
        if (LineRepository.isAlreadyExistingByName(lineName)) {
            throw new IllegalArgumentException(ALREADY_EXISTING_LINE);
        }
        return lineName;
    }
}
