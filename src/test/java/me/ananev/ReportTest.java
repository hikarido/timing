package me.ananev;

import org.testng.annotations.Test;

import java.time.LocalTime;
import java.util.List;

/**
 * TODO javadoc
 *
 * @author Ananev Konstantin (ananevkv@yoomoney.ru)
 * @since 08.08.2022
 */
public class ReportTest {
    @Test
    public void shoutl_print_report() {
        List<ReportRecord> expectedRecords = List.of(
                new ReportRecord(1, LocalTime.parse("11:00"), "inbox"),
                new ReportRecord(2, LocalTime.parse("11:10"), "ID-1754"),
                new ReportRecord(3, LocalTime.parse("12:00"), "daily"),
                new ReportRecord(4, LocalTime.parse("12:39"), "daily"),
                new ReportRecord(5, LocalTime.parse("12:44"), "break"),
                new ReportRecord(5, LocalTime.parse("12:49"), "break"));
        new Report(expectedRecords).printTasksTiming();
    }
}