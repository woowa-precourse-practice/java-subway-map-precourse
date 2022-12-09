package subway.outputview;

import subway.vo.MainCommand;
import subway.vo.StationCommand;

import java.util.Map;

public class StationCommandOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 역 관리 화면");
        for (StationCommand stationCommand : StationCommand.values()) {
            System.out.printf("%s. %s", stationCommand.getCommand(), stationCommand.getDescription());
            System.out.println();
        }

        System.out.println();
        System.out.println("## 원하는 기능을 선택하세요.");
    }
}
