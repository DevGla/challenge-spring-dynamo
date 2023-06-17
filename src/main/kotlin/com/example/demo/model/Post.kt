package com.example.demo.model

import com.amazonaws.services.dynamodbv2.datamodeling.*
import java.util.*

@DynamoDBTable(tableName = "books")
class Post(
    @field:DynamoDBHashKey
    @field:DynamoDBAttribute(attributeName = "post_id")
    var id: String = UUID.randomUUID().toString(),

    @field:DynamoDBAttribute(attributeName = "book_id")
    @field:DynamoDBIndexHashKey(globalSecondaryIndexName = "post_user_id_created_at_idx")
    var bookId: String = "",

    @field:DynamoDBAttribute(attributeName = "title")
    @field:DynamoDBIndexHashKey(globalSecondaryIndexName = "post_title_created_at_idx")
    var title: String = "",

    @field:DynamoDBAttribute(attributeName = "author_id")
    var authorId: String = "",

    @field:DynamoDBAttribute(attributeName = "author_name")
    var authorName: String = "",
)