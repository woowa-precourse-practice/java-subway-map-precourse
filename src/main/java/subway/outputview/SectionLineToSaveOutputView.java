package subway.outputview;

import java.util.Map;

public class SectionLineToSaveOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 노선을 입력하세요.");
    }
}
