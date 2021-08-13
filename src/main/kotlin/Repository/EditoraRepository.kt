package Repository

import com.spring.ProjetoLivraria.Editora
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EditoraRepository : CrudRepository<Editora, String>
