package com.example.Control2TBD.Repositories;

import com.example.Control2TBD.Models.TareaModel;

import java.util.List;

public interface TareaRepository {
    public TareaModel create(TareaModel tarea);
    public String update(TareaModel tarea, Integer id_tarea);
    public void delete(Integer id_tarea);
    public List<TareaModel> getAll();
    public String updateEstado(TareaModel tarea, Integer id_tarea);
    public List<TareaModel> buscarTareas(String estado, String palabraClave);
}
