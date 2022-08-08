package me.ananev;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Скрипт для учета рабочего времени
 * Группирует данные в таблице по столбику task, суммируя время затраченное на работу над задачей
 * Таблица хранится в файле вида
 * Имя: 02.08.2022.md
 * Содержание:
 * | №   | time  | tasks      | desc                                                                                                                                                       |
 * |:----|:------|:-----------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------|
 * | 1   | 11:00 | inbox      |                                                                                                                                                            |
 * | 2   | 11:10 | ID-1754    |                                                                                                                                                            |
 * | 3   | 12:00 | daily      | * ID-1748 п |
 * | 4   | 12:34 | break      |                                                                                                                                                            |
 * | 5   | 13:45 | ID-1754    |                                                                                                                                                            |
 * | 6   | 15:00 | review     | AN-3240 Описывает процесс ПИ через Тинькофф ID                                                                                                             |
 * | 7   | 16:36 | break      |                                                                                                                                                          |
 * | 8   | 17:00 | java learn |                                                                                                                                                          |
 * | 9   | 18:33 | break      |                                                                                                                                                          |
 * | 10  | 19:00 | java learn |                                                                                                                                                          |
 * | 11  | 22:48 | java learn |  |
 *
 * Использование:
 * передайте первым аргусентом абсолютный путь к файлу с таблицей. Запустите программу. В консоль напечаетается, сколько было времени
 * было затрачено на задачи и суммарно время работы над всеми задачами
 * @author Ananev Konstantin (ananevkv@yoomoney.ru)
 * @since 08.08.2022
 */
public class Main {
    public static void main(String[] args) throws IOException {
        if(args.length != 1) {
            throw new IllegalArgumentException("First argument should be path to report .md file");
        }

        Path path = Paths.get(args[0]);
        if(!Files.isRegularFile(path)) {
            throw new IllegalArgumentException("There is no regular file at path: " + path);
        }

        new Report(new ReportParser().readReport(path)).printTasksTiming();
    }
}