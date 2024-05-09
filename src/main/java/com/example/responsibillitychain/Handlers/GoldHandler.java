package com.example.responsibillitychain.Handlers;

import com.example.responsibillitychain.Logic.GameEngine;
import com.example.responsibillitychain.Models.Handler;
import com.example.responsibillitychain.Models.Result;

public class GoldHandler extends Handler {
    public GoldHandler(Handler next)
    {
        super(next);
    }
    public boolean handle(Result result, GameEngine game)
    {
        if(result != Result.GOLD)
        {
            return super.handle(result, game);
        } else {
            game.getPlayer().Gold += 1;
            return true;
        }
    }
}
