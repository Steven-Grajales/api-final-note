package co.udea.apifinalnote.component.nota.io.web.v1.model;

import co.udea.apifinalnote.component.nota.model.Nota;
import co.udea.apifinalnote.component.nota.service.model.NotaSaveCmd;
import lombok.*;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Generated
@Data
@Builder
public class NotaListResponse {

    @NotNull
    private Double nota;

    @NotNull
    private Double porcentaje;

    public static NotaListResponse fromModel(Nota nota) {
        return NotaListResponse.builder()
                .nota(nota.getNota())
                .porcentaje(nota.getPorcentaje())
                .build();
    }
}
