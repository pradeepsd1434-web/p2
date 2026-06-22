package org.example;

import org.junit.Test;
import org.junit.Assert;

public class Apptest {

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(2, 3);

        System.out.println("test: 2 + 3 = " + result);

        int expected = 5;
        Assert.assertEquals(expected, result);
    }
}