package co.udea.apifinalnote.component.nota.service.model;

import lombok.*;

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

}
