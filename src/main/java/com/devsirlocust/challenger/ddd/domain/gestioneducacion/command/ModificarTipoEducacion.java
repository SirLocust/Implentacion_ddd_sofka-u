package com.devsirlocust.challenger.ddd.domain.gestioneducacion.command;

import co.com.sofka.domain.generic.Command;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.GestionEducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Tipo;
import lombok.Getter;

@Getter
public class ModificarTipoEducacion implements Command {

  private final GestionEducacionId gestionEducacionId;
  private final Tipo tipo;

  public ModificarTipoEducacion(GestionEducacionId gestionEducacionId , Tipo tipo){
    this.gestionEducacionId = gestionEducacionId;
    this.tipo = tipo;
  }
}
