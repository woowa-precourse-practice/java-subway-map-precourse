package subway.domain;

import subway.system.exception.LineNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<>();

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        lines.add(line);
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    public static Line findByName(String lineName) {
        return lines.stream()
                .filter(line -> line.getName().equals(lineName))
                .findFirst()
                .orElseThrow(LineNotFoundException::new);
    }

    public static boolean isAlreadyExistingByName(String lineName) {
        return lines.stream()
                .map(Line::getName)
                .collect(Collectors.toList())
                .contains(lineName);
    }
}
