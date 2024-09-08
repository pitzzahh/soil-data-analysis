package me.araopj;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataGenerator {
    public static List<SampleData> generateRandomData(int count) {
        return  IntStream.range(0, count).mapToObj(_ -> new SampleData(
                getRandomDateTime(),
                getRandomValue(10, 100),
                getRandomValue(10, 100),
                getRandomValue(10, 100),
                getRandomValue(4.0, 10.0)
        )).collect(Collectors.toList());
    }

    private static double getRandomValue(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }

    private static LocalDateTime getRandomDateTime() {
        return LocalDateTime.now().minusDays(ThreadLocalRandom.current().nextLong(0, 5 * 365));
    }
}
