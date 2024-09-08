package me.araopj;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<SampleData> sampleData = DataGenerator.generateRandomData(50);
        Map<Integer, Double> averageByYear = DataAggregator.getAverageByYear(sampleData);
        Map<String, Double> averageByMonth = DataAggregator.getAverageByMonth(sampleData);
        Map<String, Double> averageByWeek = DataAggregator.getAverageByWeek(sampleData);

        System.out.println("\"Average By Year\" = " + "Average By Year");
        averageByYear.forEach((key, value) -> System.out.printf("%d, %f%n", key, value));
        System.out.println("\"Average By Month\" = " + "Average By Month");
        averageByMonth.forEach((key, value) -> System.out.printf("%s, %f%n", key, value));
        System.out.println("\"Average By Week\" = " + "Average By Week");
        averageByWeek.forEach((key, value) -> System.out.printf("%s, %f%n", key, value));
    }
}