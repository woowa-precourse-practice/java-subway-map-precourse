package subway.domain;

import subway.system.exception.StationNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station) {
        stations.add(station);
    }

    public static boolean deleteStation(Station target) {
        return stations.removeIf(station -> Objects.equals(station.getName(), target.getName()));
    }

    public static Station findByName(String stationName) {
        return stations
                .stream().filter(station -> station.getName().equals(stationName))
                .findFirst()
                .orElseThrow(StationNotFoundException::new);
    }

    public static boolean isExisting(Station station) {
        return stations.contains(station);
    }
}
