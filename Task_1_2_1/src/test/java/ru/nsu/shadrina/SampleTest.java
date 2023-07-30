package ru.nsu.shadrina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void checkMain() {
        Sample.main(new String[] {});
        assertTrue(true);
    }

    @Test
    void checkPrinting() {
        Sample.printHelloWorld();
    }

    @Test
    void doINeedToCheckDefaultConstructor() {
        final var sampleInstance = new Sample();
    }
}