package com.example.Control2TBD.Repositories;

import com.example.Control2TBD.Models.TareaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

@Repository
public class TareaRepositoryImp implements TareaRepository {
    @Autowired
    private Sql2o sql2o;

    @Override
    public TareaModel create(TareaModel tarea) {
        try (Connection conn = sql2o.open()) {
            String sql = "INSERT INTO tarea (id_tarea,id_usuario,titulo,descripcion,fecha_vencimiento,estado)" +
                    "VALUES (:id_tarea, :id_usuario, :titulo, :descripcion, :fecha_vencimiento, :estado)";
            conn.createQuery(sql, true)
                    .addParameter("id_tarea", tarea.getId_tarea())
                    .addParameter("id_usuario", tarea.getId_usuario())
                    .addParameter("titulo", tarea.getTitulo())
                    .addParameter("descripcion", tarea.getDescripcion())
                    .addParameter("fecha_vencimiento", tarea.getFecha_vencimiento())
                    .addParameter("estado", tarea.getEstado())
                    .executeUpdate();
            return tarea;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String update(TareaModel tarea, Integer id_tarea) {
        try (Connection conn = sql2o.open()) {
            conn.createQuery("UPDATE tarea " +
                            "SET titulo=:titulo, descripcion=:descripcion, fecha_vencimiento=:fecha_vencimiento " +
                            "WHERE id_tarea=:id_tarea")
                    .addParameter("id_tarea", id_tarea)
                    .addParameter("titulo", tarea.getTitulo())
                    .addParameter("descripcion", tarea.getDescripcion())
                    .addParameter("fecha_vencimiento", tarea.getFecha_vencimiento())
                    .executeUpdate();
            return "Tarea actualizada";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error: No se pudo actualizar la tarea";
        }
    }
    @Override
    public String updateEstado(TareaModel tarea, Integer id_tarea) {
        try (Connection conn = sql2o.open()) {
            conn.createQuery("UPDATE tarea " +
                            "SET estado=:estado " +
                            "WHERE id_tarea=:id_tarea")
                    .addParameter("id_tarea", id_tarea)
                    .addParameter("estado", tarea.getEstado())
                    .executeUpdate();
            return "Tarea actualizada";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Error: No se pudo actualizar el estado";
        }
    }

    @Override
    public void delete(Integer id_tarea) {
        try (Connection conn = sql2o.open()) {
            conn.createQuery("DELETE FROM tarea WHERE id_tarea = :id_tarea")
                    .addParameter("id_tarea", id_tarea)
                    .executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public List<TareaModel> getAll() {
        try (Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM tarea")
                    .executeAndFetch(TareaModel.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    @Override
    public List<TareaModel> getAllByUsuario(Integer id_usuario) {
        try (Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM tarea WHERE id_usuario = :id_usuario")
                    .addParameter("id_usuario", id_usuario)
                    .executeAndFetch(TareaModel.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    @Override
    public List<TareaModel> buscarTareas(String estado, String palabraClave) {
        try (Connection conn = sql2o.open()) {
            String sql = "SELECT id_tarea, id_usuario, titulo, descripcion, fecha_vencimiento, estado " +
                    "FROM public.tarea " +
                    "WHERE (:estado IS NULL OR estado = :estado) " +
                    "AND (LOWER(titulo) LIKE :palabraClave OR LOWER(descripcion) LIKE :palabraClave)";

            return conn.createQuery(sql)
                    .addParameter("estado", estado)
                    .addParameter("palabraClave", "%" + palabraClave.toLowerCase() + "%")
                    .executeAndFetch(TareaModel.class);
        }
    }
}
