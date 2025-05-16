package com.soono;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingPerformanceTest {
    private static final Logger logger = LoggerFactory.getLogger(LoggingPerformanceTest.class);
    private static final int ITERATIONS = 100_000;
    private static final String MESSAGE = "테스트 로그 메시지입니다.";

    /*
    1. 100_000건 기준
    System.out.println() 실행 시간: 515ms
    Logger.info() 실행 시간: 29ms

    2. 1_000_000건 기준
    System.out.println() 실행 시간: 4726ms
    Logger.info() 실행 시간: 517ms

    3. 10_000_000건 기준
    System.out.println() 실행 시간: 111125ms
    Logger.info() 실행 시간: 809ms
     */
    public static void main(String[] args) {
        System.out.println("System.out 성능 측정 중...");
        measureSystemOut();

        System.out.println("Logger 성능 측정 중...");
        measureLoggerInfo();

        System.out.println("로깅 완료. 로그는 logs/test.log 파일에서 확인 가능합니다.");
    }

    private static void measureSystemOut() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            System.out.println(MESSAGE);
        }
        long end = System.currentTimeMillis();
        System.out.println("System.out.println() 실행 시간: " + (end - start) + "ms");
    }

    private static void measureLoggerInfo() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            logger.info(MESSAGE);
        }
        long end = System.currentTimeMillis();
        System.out.println("Logger.info() 실행 시간: " + (end - start) + "ms");
    }
}
