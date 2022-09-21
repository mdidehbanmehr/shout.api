package com.example.models

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.javatime.*
import java.time.LocalDateTime

data class Comment(val id: Int, val title: String, val body: String)

object Comments : Table() {
    val commentId = integer("commentId").autoIncrement()
    val commentTitle = varchar("commentTitle", 128)
    val comment = varchar("comment", 1024)
    val commentAuthor = varchar("commentAuthor",   50)
    val commentRating = varchar("commentRating",   50)
    val dateCreated = datetime("date_created").default(LocalDateTime.now())

    override val primaryKey = PrimaryKey(commentId)
}