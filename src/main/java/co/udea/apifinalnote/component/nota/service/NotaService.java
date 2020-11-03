package co.udea.apifinalnote.component.nota.service;

import co.udea.apifinalnote.component.nota.model.Nota;
import co.udea.apifinalnote.component.nota.service.model.NotaSaveCmd;

import javax.validation.constraints.NotNull;

public interface NotaService {

    Nota create(@NotNull NotaSaveCmd notaToCreateCmd);

}
