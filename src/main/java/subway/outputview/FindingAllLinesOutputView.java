package subway.outputview;

import java.util.List;
import java.util.Map;

public class FindingAllLinesOutputView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 노선 목록");
        List<String> lineNames = (List<String>) model.get("lineNames");
        printLines(lineNames);
    }

    private static void printLines(List<String> lineNames) {
        for (String lineName : lineNames) {
            System.out.printf("[INFO] %s%n", lineName);
        }
    }
}
