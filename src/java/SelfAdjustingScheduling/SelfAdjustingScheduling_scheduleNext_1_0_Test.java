package com.mycompany.app;

import java.util.PriorityQueue;
import java.lang.reflect.Field;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class SelfAdjustingScheduling_scheduleNext_1_0_Test {

    private SelfAdjustingScheduling selfAdjustingScheduling;

    @BeforeEach
    public void setUp() {
        selfAdjustingScheduling = new SelfAdjustingScheduling();
        try {
            Field taskQueueField = SelfAdjustingScheduling.class.getDeclaredField("taskQueue");
            taskQueueField.setAccessible(true);
            taskQueueField.set(selfAdjustingScheduling, new PriorityQueue<>());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testScheduleNextWhenTaskQueueIsEmpty() {
        assertNull(selfAdjustingScheduling.scheduleNext());
    }

    // Helper class for creating tasks
    private static class Task implements Comparable<Task> {

        private final String name;

        private int waitTime;

        public Task(String name) {
            this.name = name;
            this.waitTime = 0;
        }

        public void incrementWaitTime() {
            waitTime++;
        }

        public int getWaitTime() {
            return waitTime;
        }

        @Override
        public int compareTo(Task o) {
            return this.name.compareTo(o.name);
        }
    }
}
