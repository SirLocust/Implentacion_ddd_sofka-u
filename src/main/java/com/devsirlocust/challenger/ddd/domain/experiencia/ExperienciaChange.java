package com.devsirlocust.challenger.ddd.domain.experiencia;

import co.com.sofka.domain.generic.EventChange;
import com.devsirlocust.challenger.ddd.domain.experiencia.event.*;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.entity.ExperienciaLaboral;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ExperienciaChange extends EventChange {
        public ExperienciaChange(Experiencia experiencia){
            apply((ExperienciaCreada event) ->{
                experiencia.experienciasLaborales = new ArrayList<>();

            });





            apply((ExperienciaLaboralAgregada event) -> {
                experiencia.experienciasLaborales().add(new ExperienciaLaboral(
                        event.getCommentId(),
                        event.getConocimientosAdquiridos(),
                        event.getInstitucion(),
                        event.getPeriodo()
                ));
            });
            apply((ExperienciaLaboralEliminada event) -> {
                experiencia.experienciasLaborales =  experiencia.experienciasLaborales().stream().filter((experienciaLaboral ->  !experienciaLaboral.identity().equals(event.getEntityId()) )).collect(Collectors.toList());
            });

            apply((EntindadExperienciaLaboralModificado event) -> {
                var experienciaLaboral = experiencia.obtenerEmpleadoPorId(event.getEntityId())
                        .orElseThrow(() -> new IllegalArgumentException("No existe experiancia laboralcon el id " + event.getEntityId()));
                experienciaLaboral.upgradePeriodo(event.getPeriodo());
                experienciaLaboral.upgradeInstitucion(event.getInstitucion());
                experienciaLaboral.upgradeConocimientosAdquiridos(event.getConocimientosAdquiridos());

            });
            apply((PeriodoExperienciaLaboralModificado event) -> {
                var experienciaLaboral = experiencia.obtenerEmpleadoPorId(event.getEntityId())
                        .orElseThrow(() -> new IllegalArgumentException("No existe experiancia laboralcon el id " + event.getEntityId()));
                experienciaLaboral.upgradePeriodo(event.getPeriodo());


            });
            apply((ConocimientosAdquiridosExperienciaLaboralModificado event) -> {
                var experienciaLaboral = experiencia.obtenerEmpleadoPorId(event.getEntityId())
                        .orElseThrow(() -> new IllegalArgumentException("No existe experiancia laboralcon el id " + event.getEntityId()));
                experienciaLaboral.upgradeConocimientosAdquiridos(event.getConocimientosAdquiridos());


            });

        }
}
