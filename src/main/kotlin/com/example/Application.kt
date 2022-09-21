package com.example

import com.example.dao.*
import io.ktor.server.application.*
import com.example.plugins.*
import org.jetbrains.exposed.sql.SchemaUtils

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    DatabaseFactory.init(environment.config)
    configureSerialization()
    configureRouting()
}