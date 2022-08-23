/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example.demo.database

import com.example.demo.database.PostsDynamicSqlSupport.Posts
import com.example.demo.database.PostsDynamicSqlSupport.Posts.createdAt
import com.example.demo.database.PostsDynamicSqlSupport.Posts.postId
import com.example.demo.database.PostsDynamicSqlSupport.Posts.text
import com.example.demo.database.PostsDynamicSqlSupport.Posts.userId
import com.example.demo.database.PostsRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun PostsMapper.count(completer: CountCompleter) =
    countFrom(this::count, Posts, completer)

fun PostsMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, Posts, completer)

fun PostsMapper.deleteByPrimaryKey(postId_: Int) =
    delete {
        where(postId, isEqualTo(postId_))
    }

fun PostsMapper.insert(record: PostsRecord) =
    insert(this::insert, record, Posts) {
        map(postId).toProperty("postId")
        map(userId).toProperty("userId")
        map(text).toProperty("text")
        map(createdAt).toProperty("createdAt")
    }

fun PostsMapper.insertMultiple(records: Collection<PostsRecord>) =
    insertMultiple(this::insertMultiple, records, Posts) {
        map(postId).toProperty("postId")
        map(userId).toProperty("userId")
        map(text).toProperty("text")
        map(createdAt).toProperty("createdAt")
    }

fun PostsMapper.insertMultiple(vararg records: PostsRecord) =
    insertMultiple(records.toList())

fun PostsMapper.insertSelective(record: PostsRecord) =
    insert(this::insert, record, Posts) {
        map(postId).toPropertyWhenPresent("postId", record::postId)
        map(userId).toPropertyWhenPresent("userId", record::userId)
        map(text).toPropertyWhenPresent("text", record::text)
        map(createdAt).toPropertyWhenPresent("createdAt", record::createdAt)
    }

private val columnList = listOf(postId, userId, text, createdAt)

fun PostsMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, Posts, completer)

fun PostsMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, Posts, completer)

fun PostsMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, Posts, completer)

fun PostsMapper.selectByPrimaryKey(postId_: Int) =
    selectOne {
        where(postId, isEqualTo(postId_))
    }

fun PostsMapper.update(completer: UpdateCompleter) =
    update(this::update, Posts, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: PostsRecord) =
    apply {
        set(postId).equalTo(record::postId)
        set(userId).equalTo(record::userId)
        set(text).equalTo(record::text)
        set(createdAt).equalTo(record::createdAt)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: PostsRecord) =
    apply {
        set(postId).equalToWhenPresent(record::postId)
        set(userId).equalToWhenPresent(record::userId)
        set(text).equalToWhenPresent(record::text)
        set(createdAt).equalToWhenPresent(record::createdAt)
    }

fun PostsMapper.updateByPrimaryKey(record: PostsRecord) =
    update {
        set(userId).equalTo(record::userId)
        set(text).equalTo(record::text)
        set(createdAt).equalTo(record::createdAt)
        where(postId, isEqualTo(record::postId))
    }

fun PostsMapper.updateByPrimaryKeySelective(record: PostsRecord) =
    update {
        set(userId).equalToWhenPresent(record::userId)
        set(text).equalToWhenPresent(record::text)
        set(createdAt).equalToWhenPresent(record::createdAt)
        where(postId, isEqualTo(record::postId))
    }