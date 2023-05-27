package Componentes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.net.URL;
@Getter
@Setter
@AllArgsConstructor
public class Supervisor {
    @NotEmpty
    protected String nombreCompletoSupervisor;
    @NotEmpty
    protected String cargoSupervisor;
    @NotEmpty
    protected int telefonoSupervisor;
}
