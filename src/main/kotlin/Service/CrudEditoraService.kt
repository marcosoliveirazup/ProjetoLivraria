package Service

import Repository.EditoraRepository
import com.spring.ProjetoLivraria.Editora
import org.springframework.stereotype.Service
import java.util.*
import javax.persistence.Id

@Service
class CrudEditoraService(private val editoraRepository: EditoraRepository) {
    private var system = true
    fun inicial(scanner: Scanner) {
        while (system) {
            println("Qual acao vc deseja executar?")
            println("0 - Cadastrar Editora")
            val action = scanner.nextInt()
            when (action) {
                0 -> cadastrar(scanner)
                else -> system = false
            }
        }
        cadastrar(scanner)

    }

    fun cadastrar(scanner: Scanner) {
        println("Nome da editora")
        val nomeEditora = scanner.next()
        val editora = Editora()
        editora.name = nomeEditora
        editoraRepository.save(editora)
        println("salvo")

    }
}
