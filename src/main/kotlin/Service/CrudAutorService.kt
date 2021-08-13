package Service

import Repository.AutorRepository
import com.spring.ProjetoLivraria.Autor
import com.spring.ProjetoLivraria.Editora
import org.springframework.stereotype.Service
import java.util.*

@Service
class CrudAutorService(private val autorRepository: AutorRepository) {
    private var system = true
    fun inicial(scanner: Scanner) {
        while (system) {
            println("Qual acao vc deseja executar?")
            println("0 - Cadastrar Autor")
            val action = scanner.nextInt()
            when (action) {
                0 -> cadastrar(scanner)
                else -> system = false
            }
        }
        cadastrar(scanner)

    }

    fun cadastrar(scanner: Scanner) {
        println("Nome da autor")
        val nomeAutor = scanner.next()
        val autor = Autor()
        autor.nome = nomeAutor
        autorRepository.save(autor)
        println("salvo")

    }
}