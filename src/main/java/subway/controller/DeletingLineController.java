package subway.controller;

import subway.domain.LineRepository;
import subway.domain.SectionRepository;
import subway.inputview.InputViewHolder;
import subway.inputview.InputViewName;
import subway.outputview.OutputViewHolder;
import subway.outputview.OutputViewName;

import java.util.Map;

public class DeletingLineController implements Controller {
    @Override
    public void process(Map<String, Object> model) {
        String lineName = getLineName(model);
        deleteFromLineAndSection(lineName);
        OutputViewHolder.get(OutputViewName.LINE_DELETE_COMPLETE).print(model);
    }

    private static void deleteFromLineAndSection(String lineName) {
        LineRepository.deleteLineByName(lineName);
        SectionRepository.deleteSectionByLineName(lineName);
    }

    private static String getLineName(Map<String, Object> model) {
        OutputViewHolder.get(OutputViewName.LINE_DELETE).print(model);
        return (String) InputViewHolder.get(InputViewName.LINE_NAME).getInput(model);
    }
}
