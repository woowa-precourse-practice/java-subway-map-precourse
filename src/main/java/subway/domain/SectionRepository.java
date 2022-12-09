package subway.domain;

import subway.system.exception.SectionNotFountException;

import java.util.ArrayList;
import java.util.List;

public class SectionRepository {
    private static final List<Section> sections = new ArrayList<>();

    public static void addSection(Line line, Station firstStation, Station lastStation) {
        sections.add(Section.makeSection(line, firstStation, lastStation));
    }

    public static Section findByLineName(String lineName) {
        return sections.stream()
                .filter(section -> section.getLineName().equals(lineName))
                .findFirst()
                .orElseThrow(SectionNotFountException::new);
    }

    public static void deleteSectionByLineName(String lineName) {
        Section section = findByLineName(lineName);
        sections.remove(section);
    }
}

