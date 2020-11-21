package co.udea.apifinalnote.component.nota.service;

import co.udea.apifinalnote.component.nota.model.Nota;

import javax.validation.constraints.NotNull;

public interface NotaGateway {

    Nota save(@NotNull Nota notaToCreate);

}
