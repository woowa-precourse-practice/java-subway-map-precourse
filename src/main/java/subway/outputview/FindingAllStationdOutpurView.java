package subway.outputview;

import java.util.List;
import java.util.Map;

public class FindingAllStationdOutpurView implements OutputView {
    @Override
    public void print(Map<String, Object> model) {
        System.out.println("## 역 목록");
        List<String> stationNames = (List<String>) model.get("stationNames");
        printStationNames(stationNames);
    }

    private static void printStationNames(List<String> stationNames) {
        for (String stationName : stationNames) {
            System.out.printf("[INFO] %s%n", stationName);
        }
    }
}
