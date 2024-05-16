package us.planet10.eightball

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(EightballAnswers::class)
class EightballApplication

fun main(args: Array<String>) {
	runApplication<EightballApplication>(*args)
}
