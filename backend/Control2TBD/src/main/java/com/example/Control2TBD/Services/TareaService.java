package com.example.Control2TBD.Services;

import com.example.Control2TBD.Models.TareaModel;
import com.example.Control2TBD.Repositories.TareaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TareaService {
    private final com.example.Control2TBD.Repositories.TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }
    //create
    @PostMapping("/tarea")
    @ResponseBody
    public TareaModel create(@RequestBody TareaModel tarea) {
        return tareaRepository.create(tarea);
    }
    // update
    @PutMapping("/tarea/update/{id_tarea}")
    @ResponseBody
    public String updateTarea(@RequestBody TareaModel tarea, @PathVariable Integer id_tarea) {
        return tareaRepository.update(tarea, id_tarea);
    }
    @PutMapping("/tarea/updateEstado/{id_tarea}")
    @ResponseBody
    public String updateEstadoTarea(@RequestBody TareaModel tarea, @PathVariable Integer id_tarea) {
        return tareaRepository.updateEstado(tarea, id_tarea);
    }
    // get all
    @GetMapping("/tarea")
    public List<TareaModel> getAllTareas() {
        return tareaRepository.getAll();
    }
    // delete
    @DeleteMapping("/tarea/{id_tarea}")
    public void borrar(@PathVariable Integer id_tarea) {
    tareaRepository.delete(id_tarea);
    }

    @GetMapping("/tarea/buscar")
    public List<TareaModel> buscarTareas(
            @RequestParam(value = "estado", required = false) String estado,
            @RequestParam(value = "palabraClave", required = false) String palabraClave) {
        return tareaRepository.buscarTareas(estado, palabraClave);
    }
}
