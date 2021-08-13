package com.spring.ProjetoLivraria

import javax.persistence.*

@Entity
@Table(name = "TB_AUTOR")
open class Autor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int? = null,
    @Column(name = "nome", nullable = false)
    open var nome: String? = null,

//    @ManyToMany(mappedBy = "autor", fetch = FetchType.EAGER)
//    var livro: List<Livro>? = null
) {




}