package subway.outputview;

import java.util.Map;

public class SectionStationToSaceOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 역이름을 입력하세요.");
    }
}
