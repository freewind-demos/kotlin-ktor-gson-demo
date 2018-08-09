package example

import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, port = 8080) {
        install(ContentNegotiation) {
            gson {}
        }
        routing {
            get("/") {
                val hello = Hello("Hello Ktor", System.currentTimeMillis())
                call.respond(hello)
            }
        }
    }
    server.start(wait = true)
}

data class Hello(val content: String, val timestamp: Long)
