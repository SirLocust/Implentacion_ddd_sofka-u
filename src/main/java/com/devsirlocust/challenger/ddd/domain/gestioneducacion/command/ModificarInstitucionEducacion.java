package com.devsirlocust.challenger.ddd.domain.gestioneducacion.command;

import co.com.sofka.domain.generic.Command;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.GestionEducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Institucion;
import lombok.Getter;

@Getter
public class ModificarInstitucionEducacion implements Command {

  private final GestionEducacionId gestionEducacionId;
  private final Institucion institucion;

  public ModificarInstitucionEducacion(GestionEducacionId gestionEducacionId, Institucion institucion){
    this.gestionEducacionId = gestionEducacionId;
    this.institucion = institucion;
  }
}
