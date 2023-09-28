package com.dewey.design_patterns.type.behavioral.responsbilitychain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbstractLoggerTest {

    private AbstractLogger abstractLoggerUnderTest;

    @BeforeEach
    void setUp() {
        abstractLoggerUnderTest = new AbstractLogger() {
            @Override
            protected void write(String message) {

            }
        };
    }

    @Test
    void testLogMessage() {
        // Setup
        // Run the test
        abstractLoggerUnderTest.logMessage(0, "message");

        // Verify the results
    }
}
