package com.example.todolist;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void convertToUpperCase_WithLowercaseAsInput() {
        assertEquals(new StringUtils().convertToUpperCase("test"), "TEST");
    }

    @Test
    public void convertToUpperCase_WithUppercaseAsInput() {
        assertEquals(new StringUtils().convertToUpperCase("TEST"), "TEST");
    }
}