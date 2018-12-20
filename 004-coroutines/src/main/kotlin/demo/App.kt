package demo

import kotlinx.coroutines.*

fun main() = runBlocking {
    val onePercent = (30_000 * 0.01).toLong()

    repeat(30_000) { n ->
        launch {
            delay(30_000L - n)

            if (n % onePercent == 0L) {
                print(".")
            }
        }

//        thread {
//            Thread.sleep(30_000L - n)
//
//            if (n % onePercent == 0L) {
//                print(".")
//            }
//        }
    }
}
