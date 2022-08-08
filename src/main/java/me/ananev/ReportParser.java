package me.ananev;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

/**
 * TODO javadoc
 *
 * @author Ananev Konstantin (ananevkv@yoomoney.ru)
 * @since 08.08.2022
 */
public class ReportParser {
    public List<ReportRecord> readReport(Path path) throws IOException {
        List<String> strings = Files.readAllLines(path);
        strings.removeIf(s -> !s.startsWith("|"));
        strings.remove(0);
        strings.remove(0);
        return strings.stream().map(this::parseLine).toList();
    }

    private ReportRecord parseLine(String line) {
        List<String> strings = Arrays.stream(line.replace(" ", "").split("\\|"))
                .filter(s -> !s.isEmpty())
                .toList();
        return new ReportRecord(Integer.parseInt(strings.get(0)), LocalTime.parse(strings.get(1)), strings.get(2));
    }
}
