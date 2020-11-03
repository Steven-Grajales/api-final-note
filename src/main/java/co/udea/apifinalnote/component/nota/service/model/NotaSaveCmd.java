package co.udea.apifinalnote.component.nota.service.model;

import co.udea.apifinalnote.component.nota.model.Nota;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Generated
@Data
@Builder
public class NotaSaveCmd {

    @NotNull
    private Integer nota;

    @NotNull
    private Double porcentaje;

    public static Nota toModel(@NotNull NotaSaveCmd notaToCreateCmd) {
        return Nota.builder()
                .nota(notaToCreateCmd.getNota())
                .porcentaje(notaToCreateCmd.getPorcentaje())
                .build();
    }
}
