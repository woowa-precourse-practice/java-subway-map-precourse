package subway.domain;

import java.util.LinkedList;
import java.util.List;

public class Section {
    private final Line line;
    private final List<Station> stations;

    public Section(Line line) {
        this.line = line;
        this.stations = new LinkedList<>();
    }

    public static Section makeSection(Line line, Station firstStation, Station lastStation) {
        Section section = new Section(line);
        section.addFirstStation(firstStation);
        section.addLastStation(lastStation);
        return section;
    }

    private void addLastStation(Station lastStation) {
        stations.add(stations.size(), lastStation);
    }

    private void addFirstStation(Station firstStation) {
        stations.add(0, firstStation);
    }

    public String getLineName() {
        return line.getName();
    }

    /**
     * 0부터 시작함에 주의
     */
    public void addStation(int index, String stationName) {
        stations.add(index, new Station(stationName));
    }
}
