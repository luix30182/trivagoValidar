/**
 * ValidarSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.validar;

import java.time.LocalDate;
import java.util.List;

import com.validar.ResponseValidarDocument.ResponseValidar;
import com.validar.ResponseValidarDocument.ResponseValidar.Ack;
import com.validar.dao.ValidarDao;
import com.validar.dto.ValidarDto;

/**
 *  ValidarSkeleton java skeleton for the axisService
 */
public class ValidarImpl extends ValidarSkeleton{
    
    ValidarDao validarDao;
    /**
     * Auto generated method signature
     *
     * @param requestValidar
     * @return responseValidar
     */
    public ResponseValidarDocument validarOperation(RequestValidarDocument requestValidar) {
       ResponseValidarDocument doc = ResponseValidarDocument.Factory.newInstance();
       ResponseValidar response = doc.addNewResponseValidar();
       Ack ack = Ack.Factory.newInstance();
       
       ValidarDto validarDto = new ValidarDto();
       validarDto.setIdHabitacion(requestValidar.getRequestValidar().getIdHabitacion());
       validarDto.setReservacion(requestValidar.getRequestValidar().getFecha());
       
      try {
          List<ValidarDto> list = validarDao.queryRowMapper(validarDto);
          
          if(list.size() >0) {
              ack.setCode("400");
              ack.setDescription("Habitacion ocupada");
              response.setAck(ack);
          }else {
              String[] d = validarDto.getReservacion().split("-");
              LocalDate res = LocalDate.of(Integer.valueOf(d[0]),Integer.valueOf(d[1]),Integer.valueOf(d[2]));
              LocalDate now = LocalDate.now();
              if(res.isAfter(now)) {
                  ack.setCode("200");
                  ack.setDescription("Ok");
                  response.setAck(ack);
              }else {
                  ack.setCode("400");
                  ack.setDescription("Fecha no valida");
                  response.setAck(ack);
              }
              
          }
      }catch(Exception e) {
          ack.setCode("500");
          ack.setDescription("Bad server");
          response.setAck(ack);
      }
       
       return doc;
    }
    /**
     * @param validarDao the validarDao to set
     */
    public final void setValidarDao(ValidarDao validarDao) {
        this.validarDao = validarDao;
    }
}
