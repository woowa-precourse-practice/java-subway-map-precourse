package subway.outputview;

import java.util.Map;

public class StationToDeleteOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 삭제할 역 이름을 입력하세요.");
    }
}
