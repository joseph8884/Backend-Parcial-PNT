package Componentes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
public class Tarea {
    @NotEmpty
    protected String descripcionTarea;
    @NotEmpty
    protected int importanciaTarea;
    protected String fechaRealizacionTarea;
    @NotEmpty
    protected int horasDedicadaTarea;
}
