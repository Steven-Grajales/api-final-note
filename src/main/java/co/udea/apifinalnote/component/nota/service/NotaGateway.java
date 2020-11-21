package co.udea.apifinalnote.component.nota.service;

import co.udea.apifinalnote.component.nota.model.Nota;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface NotaGateway {

    Nota save(@NotNull Nota notaToCreate);

    List<Nota> findAll();

}
