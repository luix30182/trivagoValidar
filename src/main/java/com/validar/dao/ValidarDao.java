package com.validar.dao;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.validar.dto.ValidarDto;

/**
 * @author tlopez
 */
public class ValidarDao {
    /**
     * Template para manejo de BD de Spring.
     */
    protected JdbcTemplate jdbcTemplate;

    /**
     * Establece el template.
     * @param jdbcTemplate
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Consulta usuarios que coincidan con el criterio.
     * @param usuarioDto Usuario a agregar.
     */
    public List<ValidarDto> queryRowMapper(ValidarDto validarDto) {
        @SuppressWarnings({ "unchecked", "rawtypes" })
        List<ValidarDto> resultList = jdbcTemplate.query(
                "Select * from reservaciones where idHabitacion = " + validarDto.getIdHabitacion() +" and reservacion = '"+ validarDto.getReservacion() +"'", 
                        new BeanPropertyRowMapper(ValidarDto.class));
        return resultList;
    }
}







