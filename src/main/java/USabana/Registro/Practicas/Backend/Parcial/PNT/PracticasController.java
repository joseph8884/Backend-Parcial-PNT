package USabana.Registro.Practicas.Backend.Parcial.PNT;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PracticasController {
    List<Practicas> listaPracticas=new ArrayList<>();

/*
    public PracticasController() throws MalformedURLException {
        listaPracticas.add(new Practicas(new Empresa(null, "das", "calle3", 333, "buena"), new Supervisor("Jose", "dsa", 212), new Tarea("buena", 2, new Date(), 21)));

    }

 */
    @GetMapping(path = "/practicas/todas")
    public List<Practicas> listaest() {
        return listaPracticas;
    }

    @PostMapping (path = "/practicas/agregar")
    public String agregarPractica(@RequestBody @Valid Practicas nuevaPractica){
        listaPracticas.add(nuevaPractica);
        return "Creado exitosamente";
    }
    @DeleteMapping(path = "/practica/eliminar/{practica}")
    public String eliminarPractica(@PathVariable Practicas practica){
        listaPracticas.remove(practica);
        return "Removido exitosamente";
    }



}
