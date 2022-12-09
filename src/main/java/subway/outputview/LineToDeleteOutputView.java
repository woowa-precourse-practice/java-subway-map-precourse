package subway.outputview;

import java.util.Map;

public class LineToDeleteOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 삭제할 노선 이름을 입력하세요.");
    }
}
