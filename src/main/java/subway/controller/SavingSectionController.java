package subway.controller;

import subway.domain.Line;
import subway.domain.SectionRepository;
import subway.domain.Station;
import subway.inputview.InputViewHolder;
import subway.inputview.InputViewName;
import subway.outputview.OutputViewHolder;
import subway.outputview.OutputViewName;

import java.util.Map;

public class SavingSectionController implements Controller {
    @Override
    public void process(Map<String, Object> model) {
        Line line = new Line(getLineName(model));
        Station station = getStation(model);
        int order = getOrder(model) - 1;

        SectionRepository.addStationAt(line, station, order);
    }

    private static int getOrder(Map<String, Object> model) {
        OutputViewHolder.get(OutputViewName.SECTION_SAVE_ORDER).print(model);
        return (int) InputViewHolder.get(InputViewName.SECTION_ORDER).getInput(model);
    }

    private static Station getStation(Map<String, Object> model) {
        OutputViewHolder.get(OutputViewName.SECTION_SAVE_STATION).print(model);
        return (Station) InputViewHolder.get(InputViewName.STATION_INFO).getInput(model);
    }

    private static String getLineName(Map<String, Object> model) {
        OutputViewHolder.get(OutputViewName.SECTION_SAVE_LINE).print(model);
        return (String) InputViewHolder.get(InputViewName.LINE_NAME).getInput(model);
    }
}
