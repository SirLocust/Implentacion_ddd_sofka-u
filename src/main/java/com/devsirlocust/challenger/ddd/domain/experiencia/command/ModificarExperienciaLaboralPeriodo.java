package com.devsirlocust.challenger.ddd.domain.experiencia.command;

import co.com.sofka.domain.generic.Command;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.id.ExperienciaId;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.id.ExperienciaLaboralId;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.ConocimientosAdquiridos;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.Institucion;
import com.devsirlocust.challenger.ddd.domain.experiencia.values.object.Periodo;
import lombok.Getter;

@Getter
public class ModificarExperienciaLaboralPeriodo implements Command {

  private final ExperienciaId experienciaId;
  private final ExperienciaLaboralId experienciaLaboralId;

  private final Periodo periodo;

  public ModificarExperienciaLaboralPeriodo(ExperienciaId experienciaId , ExperienciaLaboralId experienciaLaboralId ,  Periodo periodo){

    this.experienciaId = experienciaId;
    this.experienciaLaboralId = experienciaLaboralId;

    this.periodo = periodo;
  }
}
