package com.example.responsibillitychain.Handlers;

import com.example.responsibillitychain.Logic.GameEngine;
import com.example.responsibillitychain.Models.Handler;
import com.example.responsibillitychain.Models.Result;

public class RedstoneHandler extends Handler {
    public RedstoneHandler(Handler next)
    {
        super(next);
    }
    public boolean handle(Result result, GameEngine game)
    {
        if(result != Result.REDSTONE)
        {
            return super.handle(result, game);
        } else {
            game.getPlayer().Redstone += 1;
            return true;
        }
    }
}
