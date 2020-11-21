package co.udea.apifinalnote.component.nota.io.repository;

import co.udea.apifinalnote.component.nota.model.Nota;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends PagingAndSortingRepository<Nota, Long> {

}
