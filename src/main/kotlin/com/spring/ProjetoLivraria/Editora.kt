package com.spring.ProjetoLivraria

import javax.persistence.*

@Entity
@Table(name = "TB_EDITORA")
open class Editora(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int?= null,
    @Column(name = "name", nullable = false)
    open var name: String?= null
) {

}