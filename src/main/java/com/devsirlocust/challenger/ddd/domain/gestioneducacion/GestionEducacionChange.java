package com.devsirlocust.challenger.ddd.domain.gestioneducacion;

import co.com.sofka.domain.generic.EventChange;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.event.*;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.entity.Educacion;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class GestionEducacionChange extends EventChange {
        public GestionEducacionChange(GestionEducacion gestionEducacion){
            apply((GestionEducacionCreada event) ->{
                gestionEducacion.educaciones = new ArrayList<>();

            });





            apply((EducacionAgregada event) -> {
                gestionEducacion.educaciones.add(new Educacion(
                        event.getEntityId(),
                        event.getTipo(),
                        event.getInstitucion(),
                        event.getPeriodo(),
                        event.getEstudio()
                ));
            });
            apply((EducacionEliminada event) -> {
                gestionEducacion.educaciones =  gestionEducacion.educaciones().stream().filter((educacion ->  !educacion.identity().equals(event.getEntityId()) )).collect(Collectors.toList());
            });

            apply((InstitucionEducacionModificada event) -> {
                var educacion = gestionEducacion.obtenerEmpleadoPorId(event.getEntityId())
                        .orElseThrow(() -> new IllegalArgumentException("No existe Educacion laboralcon el id " + event.getEntityId()));

                educacion.upgradeInstitucion(event.getInstitucion());


            });
            apply((PeriodoEducacionModificado event) -> {
                var educacion = gestionEducacion.obtenerEmpleadoPorId(event.getEntityId())
                        .orElseThrow(() -> new IllegalArgumentException("No existe Educacion laboralcon el id " + event.getEntityId()));
                educacion.upgradePeriodo(event.getPeriodo());


            });
            apply((TipoEducacionModificado event) -> {
                var educacion = gestionEducacion.obtenerEmpleadoPorId(event.getEntityId())
                        .orElseThrow(() -> new IllegalArgumentException("No existe Educacion laboralcon el id " + event.getEntityId()));
                educacion.upgradeTipo(event.getTipo());


            });

        }
}
