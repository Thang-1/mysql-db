package kr.ac.kumoh.ce6.mysqldb

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import javax.print.attribute.standard.PrinterMoreInfoManufacturer

@Entity
data class Mechanic(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    var name: String,
    var model: String,
    var manufacturer: String,
    var armor: String,
    var height: Int,
    var weight: Int
)

