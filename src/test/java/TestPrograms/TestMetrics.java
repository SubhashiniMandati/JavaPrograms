package TestPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class TestMetrics {

    static class TestResult {
        String testName;
        String status;
        int duration;

        TestResult(String testName, String status, int duration) {
            this.testName = testName;
            this.status = status;
            this.duration = duration;
        }

        public String getTestName() { return testName; }
        public String getStatus() { return status; }
        public int getDuration() { return duration; }
    }

    static class TestStats {
        long runs;
        long failures;
        double avgDuration;

        TestStats(long runs, long failures, double avgDuration) {
            this.runs = runs;
            this.failures = failures;
            this.avgDuration = avgDuration;
        }

        @Override
        public String toString() {
            return "{runs=" + runs +
                    ", failures=" + failures +
                    ", avg_duration=" + String.format("%.2f", avgDuration) + "}";
        }
    }

    public static void main(String[] args) {

        List<TestResult> tests = List.of(
                new TestResult("login_test", "PASS", 5),
                new TestResult("search_test", "FAIL", 8),
                new TestResult("login_test", "FAIL", 6),
                new TestResult("checkout_test", "PASS", 12),
                new TestResult("search_test", "PASS", 7),
                new TestResult("login_test", "PASS", 4)
        );

        /* -------------------------------------------------
         * 1. Total count per status
         * ------------------------------------------------- */
        Map<String, Long> statusCount =
                tests.stream()
                        .collect(Collectors.groupingBy(
                                TestResult::getStatus,
                                Collectors.counting()
                        ));

        // Ensure SKIP is present even if missing
        statusCount.putIfAbsent("PASS", 0L);
        statusCount.putIfAbsent("FAIL", 0L);
        statusCount.putIfAbsent("SKIP", 0L);

        System.out.println("Status Count:");
        System.out.println(statusCount);

        /* -------------------------------------------------
         * 2. Per test statistics
         * ------------------------------------------------- */
        Map<String, TestStats> testStats =
                tests.stream()
                        .collect(Collectors.groupingBy(
                                TestResult::getTestName,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> {
                                            long runs = list.size();
                                            long failures = list.stream()
                                                    .filter(t -> "FAIL".equals(t.getStatus()))
                                                    .count();
                                            double avgDuration = list.stream()
                                                    .mapToInt(TestResult::getDuration)
                                                    .average()
                                                    .orElse(0.0);

                                            return new TestStats(runs, failures, avgDuration);
                                        }
                                )
                        ));

        System.out.println("\nTest Metrics:");
        testStats.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

