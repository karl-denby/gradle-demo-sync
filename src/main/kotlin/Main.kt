package org.example

import com.mongodb.kotlin.client.MongoClient
import org.bson.Document

fun main() {
    val uri = "mongodb+srv://<username>:<password>@kotlin-test.f25oy.mongodb.net/?retryWrites=true&w=majority&appName=kotlin-test"
    val mongoClient = MongoClient.create(uri)

    val database = mongoClient.getDatabase("admin")

    val command = Document("ping", 1)
    val commandResult = database.runCommand(command)
    println("Pinged your deployment. You successfully connected to MongoDB!")
}