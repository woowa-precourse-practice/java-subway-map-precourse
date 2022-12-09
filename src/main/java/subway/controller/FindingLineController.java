package subway.controller;

import subway.domain.LineRepository;
import subway.outputview.OutputViewHolder;
import subway.outputview.OutputViewName;

import java.util.List;
import java.util.Map;

public class FindingLineController implements Controller {
    @Override
    public void process(Map<String, Object> model) {
        List<String> lineNames = LineRepository.findAllNames();
        model.put("lineNames", lineNames);
        OutputViewHolder.get(OutputViewName.FIND_ALL_LINES).print(model);
    }
}
