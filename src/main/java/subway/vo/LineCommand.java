package subway.vo;

import subway.system.exception.LineCommandNotFoundException;

import java.util.Arrays;

public enum LineCommand {
    SAVE("1", "노선 등록"),
    DELETE("2", "노선 삭제"),
    FIND("3", "노선 조회"),
    BACK("B", "돌아가기");

    private final String command;
    private final String description;

    LineCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public static LineCommand findByCommand(String command) {
        return Arrays.stream(values())
                .filter(lineCommand -> lineCommand.command.equals(command))
                .findFirst()
                .orElseThrow(LineCommandNotFoundException::new);
    }

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }
}
