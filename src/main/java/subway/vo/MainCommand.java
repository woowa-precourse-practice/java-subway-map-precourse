package subway.vo;

import subway.system.exception.MainCommandNotFoundException;

import java.util.Arrays;

public enum MainCommand {
    STATION("1", "역 관리"),
    LINE("2", "노선 관리"),
    SECTION("3", "구간 관리"),
    PRINT("4", "지하철 노선도 출력"),
    QUIT("Q", "종료");

    private final String command;
    private final String description;

    MainCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public static MainCommand findByCommand(String command) {
        return Arrays.stream(values())
                .filter(mainCommand -> mainCommand.command.equals(command))
                .findFirst()
                .orElseThrow(MainCommandNotFoundException::new);
    }

    public String getDescription() {
        return description;
    }

    public String getCommand() {
        return command;
    }
}
