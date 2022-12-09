package subway.vo;

import subway.system.exception.MainCommandNotFoundException;
import subway.system.exception.StationCommandNotFoundException;

import java.util.Arrays;

public enum StationCommand {
    SAVE("1", "역 등록"),
    DELETE("2", "역 삭제"),
    FIND("3", "역 조회"),
    BACK("B", "돌아가기");

    private final String command;
    private final String description;

    StationCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public static StationCommand findByCommand(String command) {
        return Arrays.stream(values())
                .filter(stationCommand -> stationCommand.command.equals(command))
                .findFirst()
                .orElseThrow(StationCommandNotFoundException::new);
    }

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }
}
