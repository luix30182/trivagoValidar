package com.validar.dto;

public class ValidarDto {
    private Integer idReservacion;
    private Integer idHabitacion;
    private String reservacion;
    private double costo;
    /**
     * @return the idReservacion
     */
    public final Integer getIdReservacion() {
        return idReservacion;
    }
    /**
     * @param idReservacion the idReservacion to set
     */
    public final void setIdReservacion(Integer idReservacion) {
        this.idReservacion = idReservacion;
    }
    /**
     * @return the idHabitacion
     */
    public final Integer getIdHabitacion() {
        return idHabitacion;
    }
    /**
     * @param idHabitacion the idHabitacion to set
     */
    public final void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    /**
     * @return the reservacion
     */
    public final String getReservacion() {
        return reservacion;
    }
    /**
     * @param reservacion the reservacion to set
     */
    public final void setReservacion(String reservacion) {
        this.reservacion = reservacion;
    }
    /**
     * @return the costo
     */
    public final double getCosto() {
        return costo;
    }
    /**
     * @param costo the costo to set
     */
    public final void setCosto(double costo) {
        this.costo = costo;
    }
    
}
