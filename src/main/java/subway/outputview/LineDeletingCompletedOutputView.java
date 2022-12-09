package subway.outputview;

import java.util.Map;

public class LineDeletingCompletedOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("[INFO] 지하철 노선이 삭제되었습니다.");
    }
}
