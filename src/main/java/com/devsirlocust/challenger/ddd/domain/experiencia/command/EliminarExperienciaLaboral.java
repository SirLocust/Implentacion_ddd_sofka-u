package com.devsirlocust.challenger.ddd.domain.experiencia.command;

import co.com.sofka.domain.generic.Command;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.id.ExperienciaId;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.id.ExperienciaLaboralId;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.ConocimientosAdquiridos;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.Institucion;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.Periodo;
import lombok.Getter;

@Getter
public class EliminarExperienciaLaboral implements Command {

  private final ExperienciaId experienciaId;
  private final ExperienciaLaboralId experienciaLaboralId;


  public EliminarExperienciaLaboral(ExperienciaId experienciaId , ExperienciaLaboralId experienciaLaboralId ){

    this.experienciaId = experienciaId;
    this.experienciaLaboralId = experienciaLaboralId;

  }
}
