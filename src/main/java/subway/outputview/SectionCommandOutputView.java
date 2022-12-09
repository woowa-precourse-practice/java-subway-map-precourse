package subway.outputview;

import subway.vo.LineCommand;
import subway.vo.SectionCommand;

import java.util.Map;

public class SectionCommandOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 메인 화면");
        for (SectionCommand sectionCommand : SectionCommand.values()) {
            System.out.printf("%s. %s", sectionCommand.getCommand(), sectionCommand.getDescription());
            System.out.println();
        }

        System.out.println();
        System.out.println("## 원하는 기능을 선택하세요.");
    }
}
