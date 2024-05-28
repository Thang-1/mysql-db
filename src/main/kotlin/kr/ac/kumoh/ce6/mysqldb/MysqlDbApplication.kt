package kr.ac.kumoh.ce6.mysqldb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MysqlDbApplication

fun main(args: Array<String>) {
	runApplication<MysqlDbApplication>(*args)
}
