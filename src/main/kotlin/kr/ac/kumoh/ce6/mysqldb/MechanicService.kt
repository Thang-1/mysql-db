package kr.ac.kumoh.ce6.mysqldb

import org.springframework.stereotype.Service

@Service
class MechanicService(val repository: MechanicRepository) {
    fun getAllMechanic(): List<Mechanic> {
        return repository.findAll()
    }

    fun add(mechanic: Mechanic){
        if(mechanic.name.isBlank() || mechanic.model.isBlank())
            throw IllegalArgumentException("name 및 model은 null이 될 수 없습니다.")
        repository.save(mechanic)
    }

    fun getMechanicJoinGunpla(): List<MechanicJoinGunplaDto> {
        return repository.findMechanicJoinGunpla()
    }
}