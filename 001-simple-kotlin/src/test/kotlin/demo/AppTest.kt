package demo

import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test
    fun testAppHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greet(), "app should have a greeting")
    }
}
