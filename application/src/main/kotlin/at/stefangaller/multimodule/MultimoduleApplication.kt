package at.stefangaller.multimodule

import at.stefangaller.multimodule.api.ApiConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(ApiConfiguration::class)
class MultimoduleApplication

fun main(args: Array<String>) {
    runApplication<MultimoduleApplication>(*args)
}
