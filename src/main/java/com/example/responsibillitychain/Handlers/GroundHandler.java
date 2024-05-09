package com.example.responsibillitychain.Handlers;

import com.example.responsibillitychain.Logic.GameEngine;
import com.example.responsibillitychain.Models.Handler;
import com.example.responsibillitychain.Models.Result;

public class GroundHandler extends Handler {
    public GroundHandler(Handler next) {
        super(next);
    }
    public boolean handle(Result result, GameEngine game)
    {
        if(result != Result.GROUND)
        {
            return super.handle(result, game);
        } else {
            game.getPlayer().Health += 0;
            return true;
        }
    }
}
