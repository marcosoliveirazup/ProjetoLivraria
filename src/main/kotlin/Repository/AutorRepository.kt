package Repository

import Service.CrudAutorService
import com.spring.ProjetoLivraria.Autor
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AutorRepository : CrudRepository<Autor, String>