package com.qa.uam.sid;

import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

import java.lang.reflect.Method;

public class TestRunner extends Runner{

    private Class testClass;
    public TestRunner(Class testClass) {
        super();
        this.testClass = testClass;
    }

    @Override
    public Description getDescription() {
        return Description
                .createTestDescription(testClass, "My runner description");
    }

    @Override
    public void run(RunNotifier notifier) {
        System.out.println("running the tests from MyRunner: " + testClass);
    }
}
