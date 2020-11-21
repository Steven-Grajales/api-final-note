package co.udea.apifinalnote.component.nota.io.gateway;

import co.udea.apifinalnote.component.nota.io.repository.NotaRepository;
import co.udea.apifinalnote.component.nota.model.Nota;
import co.udea.apifinalnote.component.nota.service.NotaGateway;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Repository
@RequiredArgsConstructor
public class NotaGatewayImpl implements NotaGateway {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final NotaRepository notaRepository;

    @Override
    public Nota save(@NotNull Nota notaToCreate) {
        logger.debug("Begin save: notaToCreate = {}", notaToCreate);

        final Nota notaToBeCreated = notaToCreate.toBuilder()
                .createDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        final Nota notaCreated = notaRepository.save(notaToBeCreated);

        logger.debug("End save notaCreated = {}", notaCreated);

        return notaCreated;
    }
}
