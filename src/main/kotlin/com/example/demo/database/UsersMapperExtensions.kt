/*
 * Auto-generated file. Created by MyBatis Generator
 */
package com.example.demo.database

import com.example.demo.database.UsersDynamicSqlSupport.Users
import com.example.demo.database.UsersDynamicSqlSupport.Users.createdAt
import com.example.demo.database.UsersDynamicSqlSupport.Users.displayName
import com.example.demo.database.UsersDynamicSqlSupport.Users.email
import com.example.demo.database.UsersDynamicSqlSupport.Users.loginId
import com.example.demo.database.UsersDynamicSqlSupport.Users.password
import com.example.demo.database.UsersDynamicSqlSupport.Users.userId
import com.example.demo.database.UsersRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun UsersMapper.count(completer: CountCompleter) =
    countFrom(this::count, Users, completer)

fun UsersMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, Users, completer)

fun UsersMapper.deleteByPrimaryKey(userId_: Int) =
    delete {
        where(userId, isEqualTo(userId_))
    }

fun UsersMapper.insert(record: UsersRecord) =
    insert(this::insert, record, Users) {
        map(userId).toProperty("userId")
        map(loginId).toProperty("loginId")
        map(displayName).toProperty("displayName")
        map(email).toProperty("email")
        map(password).toProperty("password")
        map(createdAt).toProperty("createdAt")
    }

fun UsersMapper.insertMultiple(records: Collection<UsersRecord>) =
    insertMultiple(this::insertMultiple, records, Users) {
        map(userId).toProperty("userId")
        map(loginId).toProperty("loginId")
        map(displayName).toProperty("displayName")
        map(email).toProperty("email")
        map(password).toProperty("password")
        map(createdAt).toProperty("createdAt")
    }

fun UsersMapper.insertMultiple(vararg records: UsersRecord) =
    insertMultiple(records.toList())

fun UsersMapper.insertSelective(record: UsersRecord) =
    insert(this::insert, record, Users) {
        map(userId).toPropertyWhenPresent("userId", record::userId)
        map(loginId).toPropertyWhenPresent("loginId", record::loginId)
        map(displayName).toPropertyWhenPresent("displayName", record::displayName)
        map(email).toPropertyWhenPresent("email", record::email)
        map(password).toPropertyWhenPresent("password", record::password)
        map(createdAt).toPropertyWhenPresent("createdAt", record::createdAt)
    }

private val columnList = listOf(userId, loginId, displayName, email, password, createdAt)

fun UsersMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, Users, completer)

fun UsersMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, Users, completer)

fun UsersMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, Users, completer)

fun UsersMapper.selectByPrimaryKey(userId_: Int) =
    selectOne {
        where(userId, isEqualTo(userId_))
    }

fun UsersMapper.update(completer: UpdateCompleter) =
    update(this::update, Users, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: UsersRecord) =
    apply {
        set(userId).equalTo(record::userId)
        set(loginId).equalTo(record::loginId)
        set(displayName).equalTo(record::displayName)
        set(email).equalTo(record::email)
        set(password).equalTo(record::password)
        set(createdAt).equalTo(record::createdAt)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: UsersRecord) =
    apply {
        set(userId).equalToWhenPresent(record::userId)
        set(loginId).equalToWhenPresent(record::loginId)
        set(displayName).equalToWhenPresent(record::displayName)
        set(email).equalToWhenPresent(record::email)
        set(password).equalToWhenPresent(record::password)
        set(createdAt).equalToWhenPresent(record::createdAt)
    }

fun UsersMapper.updateByPrimaryKey(record: UsersRecord) =
    update {
        set(loginId).equalTo(record::loginId)
        set(displayName).equalTo(record::displayName)
        set(email).equalTo(record::email)
        set(password).equalTo(record::password)
        set(createdAt).equalTo(record::createdAt)
        where(userId, isEqualTo(record::userId))
    }

fun UsersMapper.updateByPrimaryKeySelective(record: UsersRecord) =
    update {
        set(loginId).equalToWhenPresent(record::loginId)
        set(displayName).equalToWhenPresent(record::displayName)
        set(email).equalToWhenPresent(record::email)
        set(password).equalToWhenPresent(record::password)
        set(createdAt).equalToWhenPresent(record::createdAt)
        where(userId, isEqualTo(record::userId))
    }