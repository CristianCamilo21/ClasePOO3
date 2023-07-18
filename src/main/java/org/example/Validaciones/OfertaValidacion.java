package org.example.Validaciones;

import java.time.LocalDate;

public class OfertaValidacion {

    public Boolean validarTitulo(String titulo) {
        return true;
    }

    public Boolean validarFecha(LocalDate fechainicio, LocalDate fechafin){
        return true;
   }

   public  Boolean validarFormato(LocalDate fecha){
        return true;
   }
   public Boolean validarCosto(Integer costo){
        return true;
   }
}
