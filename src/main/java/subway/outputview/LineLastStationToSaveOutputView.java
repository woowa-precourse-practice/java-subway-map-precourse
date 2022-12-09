package subway.outputview;

import java.util.Map;

public class LineLastStationToSaveOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 등록할 노선의 하행 종점역 이름을 입력하세요.");
    }
}
