package co.udea.apifinalnote.component.nota.io.web.v1;

import co.udea.apifinalnote.component.nota.io.web.v1.model.NotaSaveRequest;
import co.udea.apifinalnote.component.nota.model.Nota;
import co.udea.apifinalnote.component.nota.service.NotaService;
import co.udea.apifinalnote.component.nota.service.model.NotaSaveCmd;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;

import static org.springframework.web.util.UriComponentsBuilder.fromUriString;

@RestController
@RequestMapping(path = "api/v1/notas", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class NotaController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final NotaService notaService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    @CrossOrigin(exposedHeaders = {HttpHeaders.LOCATION})
    public ResponseEntity<Void> create(@Valid @NotNull @RequestBody NotaSaveRequest notaToCreate) {
        logger.debug("Begin create: notaToCreate = {}", notaToCreate);

        final NotaSaveCmd notaToCreateCmd = NotaSaveRequest.toModel(notaToCreate);

        final Nota notaCreated = notaService.create(notaToCreateCmd);

        URI location = fromUriString("/api/v1/users").path("/{id}")
                .buildAndExpand(notaCreated.getId()).toUri();

        logger.debug("End create: notaCreated: {}", notaCreated);

        return ResponseEntity.created(location).build();
    }

}
