package nu.westlin.trafficsurveillance

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TrafficSurveillanceApplication

fun main(args: Array<String>) {
    runApplication<TrafficSurveillanceApplication>(*args)
}
