package Componentes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.net.URL;
@Getter
@Setter
@AllArgsConstructor
public class Empresa {
        //Datos Empresa
        @NotEmpty
        protected String nombreEmpresa;
        @NotEmpty
        protected String sitioWebEmpresa;
        @NotEmpty
        protected String direccionEmpresa;

        @NotEmpty
        protected int numeroTelefonoEmpresa;
        @NotEmpty
        protected String descripcionEmpresa;
}
