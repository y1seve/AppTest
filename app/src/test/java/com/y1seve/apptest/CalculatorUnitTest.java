package com.y1seve.apptest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by y1seve on 17/6/3.
 */

public class CalculatorUnitTest {

    @Test
    public void add_isCorrect() {
        assertThat(Calculator.add(1, 2), is(3));
    }
}
