package subway.vo;

import subway.system.exception.MainCommandNotFoundException;
import subway.system.exception.SectionCommandNotFoundException;

import java.util.Arrays;

public enum SectionCommand {
    SAVE("1", "구간 등록"),
    DELETE("2", "구간 삭제"),
    BACK("B", "돌아가기");

    private final String command;
    private final String description;

    SectionCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public static SectionCommand findByCommand(String command) {
        return Arrays.stream(values())
                .filter(sectionCommand -> sectionCommand.command.equals(command))
                .findFirst()
                .orElseThrow(SectionCommandNotFoundException::new);
    }

    public String getDescription() {
        return description;
    }

    public String getCommand() {
        return command;
    }
}
