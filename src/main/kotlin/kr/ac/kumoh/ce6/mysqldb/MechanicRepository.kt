package kr.ac.kumoh.ce6.mysqldb

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.Query

@Repository
interface MechanicRepository : JpaRepository<Mechanic, Int> {
    @Query("""
       select new kr.ac.kumoh.ce6.mysqldb.MechanicJoinGunplaDto(
           m.id as mechanicId, name, model,
           g.id as gunplaId, title, grade, date, price)
       from Mechanic m left outer join Gunpla g
       on m.id = g.mechanic_id
    """)
    fun findMechanicJoinGunpla(): List<MechanicJoinGunplaDto>
}
