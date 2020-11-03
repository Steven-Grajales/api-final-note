package co.udea.apifinalnote.component.nota.io.web.v1.model;

import co.udea.apifinalnote.component.nota.service.model.NotaSaveCmd;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Generated
@Data
@Builder
public class NotaSaveRequest {

    @NotNull
    @NotBlank
    private Integer nota;

    @NotNull
    @NotBlank
    private Double porcentaje;

    public static NotaSaveCmd toModel(NotaSaveRequest notaToCreate) {
        return NotaSaveCmd.builder()
                .nota(notaToCreate.getNota())
                .porcentaje(notaToCreate.getPorcentaje())
                .build();
    }

}
