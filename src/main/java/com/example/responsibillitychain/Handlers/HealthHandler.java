package com.example.responsibillitychain.Handlers;

import com.example.responsibillitychain.Logic.GameEngine;
import com.example.responsibillitychain.Models.Handler;
import com.example.responsibillitychain.Models.Result;

public class HealthHandler extends Handler {
    public HealthHandler(Handler next) {
        super(next);
    }
    public boolean handle(Result result, GameEngine game)
    {
        if(result != Result.HEALTH)
        {
            return super.handle(result, game);
        } else {
            game.getPlayer().Health += 10;
            return true;
        }
    }
}
