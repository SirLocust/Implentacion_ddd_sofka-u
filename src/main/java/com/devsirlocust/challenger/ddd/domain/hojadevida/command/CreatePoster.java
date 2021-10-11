package com.devsirlocust.challenger.ddd.domain.hojadevida.command;

import co.com.sofka.domain.generic.Command;
import com.devsirlocust.challenger.ddd.domain.hojadevida.values.id.HojaDeVidaId;
import com.devsirlocust.challenger.ddd.domain.hojadevida.values.object.NickName;
import lombok.Data;

@Data

public class CreatePoster implements Command {

    private HojaDeVidaId entityId;
    private NickName nickName;

    public CreatePoster(HojaDeVidaId entityId, NickName nickName){

        this.entityId = entityId;
        this.nickName = nickName;
    }
}
