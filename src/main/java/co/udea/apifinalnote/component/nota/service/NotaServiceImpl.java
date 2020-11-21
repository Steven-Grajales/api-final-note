package co.udea.apifinalnote.component.nota.service;

import co.udea.apifinalnote.component.nota.model.Nota;
import co.udea.apifinalnote.component.nota.service.model.NotaSaveCmd;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;


@Service
@RequiredArgsConstructor
@Transactional
public class NotaServiceImpl implements NotaService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final NotaGateway notaGateway;

    @Override
    public Nota create(@NotNull NotaSaveCmd notaToCreateCmd) {
        logger.debug("Begining to create notaToCreateCmd = {}", notaToCreateCmd);

        Nota notaToCreate = NotaSaveCmd.toModel(notaToCreateCmd);

        Nota notaCreated = notaGateway.save(notaToCreate);

        logger.debug("End create notaCreated = {}", notaCreated);

        return notaCreated;
    }

}
