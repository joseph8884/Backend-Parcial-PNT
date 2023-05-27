package USabana.Registro.Practicas.Backend.Parcial.PNT;

import Componentes.Empresa;
import Componentes.Supervisor;
import Componentes.Tarea;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Practicas {
    @NotEmpty(message = "Ingrese todos los valores para la empresa")
    @NotNull(message = "No esta el campoo")
    protected Empresa empresa;

    @NotEmpty(message = "Ingrese todos los valores para supervisor")
    @NotNull(message = "No esta el campoo")
    protected Supervisor supervisor;

    @NotEmpty(message = "Ingrese todos los valores para supervisor")
    @NotNull(message = "No esta el campoo")
    protected Tarea tarea;

}
