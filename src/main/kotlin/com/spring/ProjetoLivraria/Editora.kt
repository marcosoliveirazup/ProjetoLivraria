package com.spring.ProjetoLivraria

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "TB_EDITORA")
class Editora(
    @Id
    @Column(name = "id", nullable = false)
    open var id: Int?= null,
    @Column(name = "name", nullable = false)
    open var name: String?= null
) {

}