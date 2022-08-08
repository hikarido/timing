package me.ananev;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TODO javadoc
 *
 * @author Ananev Konstantin (ananevkv@yoomoney.ru)
 * @since 08.08.2022
 */
public class ReportParserTest {
    @Test
    public void testReadReport() throws URISyntaxException, IOException {
        ReportParser reportParser = new ReportParser();
        URL resource = ReportParser.class.getResource("rowReport1.md");
        Path path = Paths.get(resource.toURI());
        List<ReportRecord> reportRecords = reportParser.readReport(path);
        assertThat(reportRecords).hasSize(4);
        List<ReportRecord> expectedRecords = List.of(
                new ReportRecord(1, LocalTime.parse("11:00"), "inbox"),
                new ReportRecord(2, LocalTime.parse("11:10"), "ID-1754"),
                new ReportRecord(3, LocalTime.parse("12:00"), "daily"),
                new ReportRecord(4, LocalTime.parse("12:39"), "daily"));
        assertThat(reportRecords).isEqualTo(expectedRecords);
    }
}