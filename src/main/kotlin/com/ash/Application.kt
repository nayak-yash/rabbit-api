package com.ash

import io.ktor.server.application.*
import io.ktor.server.netty.*
import com.ash.plugins.*

fun main(args: Array<String>): Unit =EngineMain.main(args)

fun Application.module() {
    configureMonitoring()
    configureSerialization()
    configureRouting()
}
