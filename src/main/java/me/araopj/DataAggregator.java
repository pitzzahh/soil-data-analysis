package me.araopj;

import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class DataAggregator {
    public static Map<Integer, Double> getAverageByYear(List<SampleData> data) {
        return data.stream()
                .collect(Collectors.groupingBy(
                        d -> d.getCreatedAt().getYear(),
                        Collectors.averagingDouble(SampleData::getNitrogen)
                ));
    }
    public static Map<String, Double> getAverageByMonth(List<SampleData> data) {
        return data.stream()
                .collect(Collectors.groupingBy(
                        d -> d.getCreatedAt().getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH),
                        Collectors.averagingDouble(SampleData::getNitrogen)
                ));
    }

    public static Map<String, Double> getAverageByWeek(List<SampleData> data) {
        return data.stream()
                .collect(Collectors.groupingBy(
                        d -> d.getCreatedAt().getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH),
                        Collectors.averagingDouble(SampleData::getNitrogen)
                ));
    }

}
