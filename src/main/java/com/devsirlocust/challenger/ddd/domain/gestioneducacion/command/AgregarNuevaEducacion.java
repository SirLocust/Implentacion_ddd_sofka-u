package com.devsirlocust.challenger.ddd.domain.gestioneducacion.command;

import co.com.sofka.domain.generic.Command;
import com.devsirlocust.challenger.ddd.domain.experiencia.command.AgregarExperienciaLaboral;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.EducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.id.GestionEducacionId;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Estudio;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Institucion;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Periodo;
import com.devsirlocust.challenger.ddd.domain.gestioneducacion.values.object.Tipo;
import lombok.Getter;

@Getter
public class AgregarNuevaEducacion implements Command {

  private final GestionEducacionId gestionEducacionId;
  private final EducacionId entityId;
  private final Tipo tipo;
  private final Institucion institucion;
  private final Periodo periodo;
  private final Estudio estudio;

  public AgregarNuevaEducacion(GestionEducacionId gestionEducacionId, EducacionId entityId, Tipo tipo, Institucion institucion , Periodo periodo, Estudio estudio){

    this.gestionEducacionId = gestionEducacionId;
    this.entityId = entityId;
    this.tipo = tipo;
    this.institucion = institucion;
    this.periodo = periodo;
    this.estudio = estudio;
  }
}
