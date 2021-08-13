package com.spring.ProjetoLivraria

import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
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
    open var dataDePublicacao: String? = null
) {

//    @ManyToOne
//    @JoinColumn(name = "author_id", nullable = false)
//    var name: Autor? = null
//
//    @Fetch(FetchMode.SELECT)
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//        name = "AUTOR_LIVRO",
//        joinColumns = [JoinColumn(name = "fk_livro")],
//        inverseJoinColumns = [JoinColumn(name = "fk_autor")]
//    )
//
//    var autor: List<Autor>? = null

}