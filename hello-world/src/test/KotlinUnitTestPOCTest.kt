package test

import main.helloWorld
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


import kotlin.test.assertEquals

@Test
@DisplayName("kak")
fun helloWorldReturnsPersonalizedMessage() {
    val expected = "Hello, Molly!"
    val actual: String

    actual = helloWorld("Molly")


    assertEquals(expected, actual)
}

@Test
fun helloWorldReturnsGenericMessage() {
    assertEquals("Hello, World!", helloWorld())
}