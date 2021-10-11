package com.devsirlocust.challenger.ddd.domain.gestioneducacion.command;

import co.com.sofka.domain.generic.Command;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.GestionEducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Estudio;
import lombok.Getter;

@Getter
public class ModificarEstudioEducacion implements Command {

  private final GestionEducacionId gestionEducacionId;
  private final Estudio estudio;

  public ModificarEstudioEducacion(GestionEducacionId gestionEducacionId, Estudio estudio){
    this.gestionEducacionId = gestionEducacionId;
    this.estudio = estudio;
  }
}
