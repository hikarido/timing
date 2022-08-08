package me.ananev;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * TODO javadoc
 *
 * @author Ananev Konstantin (ananevkv@yoomoney.ru)
 * @since 08.08.2022
 */
public class Report {
    private List<ReportRecord> records;

    public Report(List<ReportRecord> records) {
        this.records = new ArrayList<>(records);
    }

    public void printTasksTiming() {
        Map<String, Duration> map = new HashMap<>();
        for(int i = 0; i < records.size() - 1; i++) {
            ReportRecord cur = records.get(i);
            ReportRecord next = records.get(i + 1);
            map.putIfAbsent(cur.taskName(), Duration.ZERO);
            map.compute(cur.taskName(), (s, duration) ->  duration.plus(Duration.between(cur.time(), next.time())));
        }

        map.entrySet().stream().forEach(nameToTime -> System.out.println(
                String.format("%s -> %s",nameToTime.getKey(), nameToTime.getValue())));

        Duration wholeTime = map.entrySet().stream().map(Map.Entry::getValue)
                .reduce((duration, duration2) -> duration.plus(duration2)).orElseThrow();
        System.out.println("WholeTime: " + wholeTime);
    }
}
