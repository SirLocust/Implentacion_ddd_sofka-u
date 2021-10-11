package com.devsirlocust.challenger.ddd.domain.gestioneducacion.command;

import co.com.sofka.domain.generic.Command;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.GestionEducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Periodo;
import lombok.Getter;

@Getter
public class ActualizarPeriodoEducacion implements Command {

  private final GestionEducacionId gestionEducacionId;
  private final Periodo periodo;

  public ActualizarPeriodoEducacion(GestionEducacionId gestionEducacionId, Periodo periodo){
    this.gestionEducacionId = gestionEducacionId;
    this.periodo = periodo;
  }
}
