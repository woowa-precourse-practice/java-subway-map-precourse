package subway.outputview;

import java.util.Map;

public class LineFirstStationToSaveOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 등록할 노선의 상행 종점역 이름을 입력하세요.");
    }
}
