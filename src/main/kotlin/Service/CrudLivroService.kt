package Service

import Repository.LivroRepository
import com.spring.ProjetoLivraria.Livro
import org.springframework.stereotype.Service
import java.util.*
import java.util.function.Consumer

@Service
class CrudLivroService(private val livroRepository: LivroRepository) {
    private var system = true
    fun inicial(scanner: Scanner) {
        while (system) {
            println("Qual acao vc deseja executar?")
            println("0 - Cadastrar Livro")
            println("1 - Consultar Livros")
            val action = scanner.nextInt()
            when (action) {
                0 -> cadastrar(scanner)
                1 -> consultar(scanner)
                else -> system = false
            }
        }
        cadastrar(scanner)

    }

    fun cadastrar(scanner: Scanner) {
        println("Titulo do Livro")
        val tituloLivro = scanner.next()
        val livro = Livro()
        livro.titulo = tituloLivro
        livroRepository.save(livro)
        println("salvo")

        println("Isbn do Livro")
        val isbnLivro = scanner.next()
        val isbn = Livro()
        livro.isbn = isbnLivro
        livroRepository.save(isbn)
        println("salvo")

        println("Data da publicação")
        val DataLivro = scanner.next()
        val datadepublicacao = Livro()
        livro.dataDePublicacao = DataLivro
        livroRepository.save(datadepublicacao)
        println("salvo")

    }

    fun consultar(scanner: Scanner) {
        val livros = livroRepository.findAll()
        livros.forEach(Consumer { livros: Livro? -> println(livros) })
    }


}