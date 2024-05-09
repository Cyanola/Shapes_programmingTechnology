package com.example.responsibillitychain.Handlers;

import com.example.responsibillitychain.Logic.GameEngine;
import com.example.responsibillitychain.Models.Handler;
import com.example.responsibillitychain.Models.Result;

public class LavaHandler extends Handler {
    public LavaHandler(Handler next) {
        super(next);
    }
    public boolean handle(Result result, GameEngine game)
    {
        if(result != Result.LAVA)
        {
            return super.handle(result, game);
        } else {
            game.getPlayer().Health -= 20;
            return true;
        }
    }
}
