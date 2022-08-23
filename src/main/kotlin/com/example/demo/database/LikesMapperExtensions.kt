/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example.demo.database

import com.example.demo.database.LikesDynamicSqlSupport.Likes
import com.example.demo.database.LikesDynamicSqlSupport.Likes.createdAt
import com.example.demo.database.LikesDynamicSqlSupport.Likes.postId
import com.example.demo.database.LikesDynamicSqlSupport.Likes.userId
import com.example.demo.database.LikesRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun LikesMapper.count(completer: CountCompleter) =
    countFrom(this::count, Likes, completer)

fun LikesMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, Likes, completer)

fun LikesMapper.deleteByPrimaryKey(userId_: Int, postId_: Int) =
    delete {
        where(userId, isEqualTo(userId_))
        and(postId, isEqualTo(postId_))
    }

fun LikesMapper.insert(record: LikesRecord) =
    insert(this::insert, record, Likes) {
        map(userId).toProperty("userId")
        map(postId).toProperty("postId")
        map(createdAt).toProperty("createdAt")
    }

fun LikesMapper.insertMultiple(records: Collection<LikesRecord>) =
    insertMultiple(this::insertMultiple, records, Likes) {
        map(userId).toProperty("userId")
        map(postId).toProperty("postId")
        map(createdAt).toProperty("createdAt")
    }

fun LikesMapper.insertMultiple(vararg records: LikesRecord) =
    insertMultiple(records.toList())

fun LikesMapper.insertSelective(record: LikesRecord) =
    insert(this::insert, record, Likes) {
        map(userId).toPropertyWhenPresent("userId", record::userId)
        map(postId).toPropertyWhenPresent("postId", record::postId)
        map(createdAt).toPropertyWhenPresent("createdAt", record::createdAt)
    }

private val columnList = listOf(userId, postId, createdAt)

fun LikesMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, Likes, completer)

fun LikesMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, Likes, completer)

fun LikesMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, Likes, completer)

fun LikesMapper.selectByPrimaryKey(userId_: Int, postId_: Int) =
    selectOne {
        where(userId, isEqualTo(userId_))
        and(postId, isEqualTo(postId_))
    }

fun LikesMapper.update(completer: UpdateCompleter) =
    update(this::update, Likes, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: LikesRecord) =
    apply {
        set(userId).equalTo(record::userId)
        set(postId).equalTo(record::postId)
        set(createdAt).equalTo(record::createdAt)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: LikesRecord) =
    apply {
        set(userId).equalToWhenPresent(record::userId)
        set(postId).equalToWhenPresent(record::postId)
        set(createdAt).equalToWhenPresent(record::createdAt)
    }

fun LikesMapper.updateByPrimaryKey(record: LikesRecord) =
    update {
        set(createdAt).equalTo(record::createdAt)
        where(userId, isEqualTo(record::userId))
        and(postId, isEqualTo(record::postId))
    }

fun LikesMapper.updateByPrimaryKeySelective(record: LikesRecord) =
    update {
        set(createdAt).equalToWhenPresent(record::createdAt)
        where(userId, isEqualTo(record::userId))
        and(postId, isEqualTo(record::postId))
    }