package subway.outputview;

import subway.vo.LineCommand;

import java.util.Map;

public class LineCommandOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 노선 관리 화면");
        for (LineCommand lineCommand : LineCommand.values()) {
            System.out.printf("%s. %s", lineCommand.getCommand(), lineCommand.getDescription());
            System.out.println();
        }

        System.out.println();
        System.out.println("## 원하는 기능을 선택하세요.");
    }
}
