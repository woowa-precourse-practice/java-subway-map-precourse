package subway.controller;

import subway.inputview.InputViewHolder;
import subway.inputview.InputViewName;
import subway.outputview.OutputViewHolder;
import subway.outputview.OutputViewName;
import subway.system.ControllerName;
import subway.vo.SectionCommand;

import java.util.Map;

public class SectionController implements Controller {
    @Override
    public void process(Map<String, Object> model) {
        OutputViewHolder.get(OutputViewName.SECTION_COMMAND).print(model);
        SectionCommand sectionCommand = (SectionCommand) InputViewHolder.get(InputViewName.SECTION_COMMAND).getInput(model);
        if (sectionCommand == SectionCommand.SAVE) {
            ControllerHolder.get(ControllerName.SECTION_SAVE).process(model);
        }
        if (sectionCommand == SectionCommand.DELETE) {

        }
        if (sectionCommand == SectionCommand.BACK) {

        }
    }
}
