package offtop.UserSessionService

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.SpringApplication


@SpringBootApplication
class UserSessionServiceApplication

fun main(args: Array<String>) {
	SpringApplication.run(UserSessionServiceApplication::class.java, *args)
}
