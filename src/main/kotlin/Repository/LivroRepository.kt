package Repository

import com.spring.ProjetoLivraria.Editora
import com.spring.ProjetoLivraria.Livro
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LivroRepository : CrudRepository<Livro, String> {
}