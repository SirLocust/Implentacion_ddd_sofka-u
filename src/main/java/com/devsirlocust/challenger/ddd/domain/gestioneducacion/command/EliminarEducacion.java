package com.devsirlocust.challenger.ddd.domain.gestioneducacion.command;

import co.com.sofka.domain.generic.Command;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.EducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.GestionEducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Estudio;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Institucion;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Periodo;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Tipo;
import lombok.Getter;

@Getter
public class EliminarEducacion implements Command {

  private final GestionEducacionId gestionEducacionId;
  private final EducacionId entityId;


  public EliminarEducacion(GestionEducacionId gestionEducacionId, EducacionId entityId){

    this.gestionEducacionId = gestionEducacionId;
    this.entityId = entityId;

  }
}
