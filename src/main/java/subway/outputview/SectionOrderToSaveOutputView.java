package subway.outputview;

import java.util.Map;

public class SectionOrderToSaveOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 순서를 입력하세요.");
    }
}
