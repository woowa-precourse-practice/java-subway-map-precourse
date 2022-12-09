package subway.outputview;

import subway.vo.MainCommand;

import java.util.Map;

public class MainOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 메인 화면");
        for (MainCommand mainCommand : MainCommand.values()) {
            System.out.printf("%s. %s", mainCommand.getCommand(), mainCommand.getDescription());
            System.out.println();
        }

        System.out.println();
        System.out.println("## 원하는 기능을 선택하세요.");
    }
}
