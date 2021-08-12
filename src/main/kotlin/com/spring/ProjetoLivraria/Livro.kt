package com.spring.ProjetoLivraria

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "TB_LIVRO")
class Livro(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int? = null,
    @Column(name = "titulo", nullable = false)
    open var titulo: String? = null,
    @Column(name = "isbn", nullable = false)
    open var isbn: String? = null,
    @Column(name = "descricao", nullable = false)
    open var descricao: String? = null,
    @Column(name = "dataDePublicacao", nullable = false)
    open var dataDePublicacao: LocalDate? = null
) {





}