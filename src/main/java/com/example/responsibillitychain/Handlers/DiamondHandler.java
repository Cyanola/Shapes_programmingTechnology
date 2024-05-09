package com.example.responsibillitychain.Handlers;

import com.example.responsibillitychain.Logic.GameEngine;
import com.example.responsibillitychain.Models.Handler;
import com.example.responsibillitychain.Models.Result;

public class DiamondHandler extends Handler {
    public DiamondHandler(Handler next)
    {
        super(next);
    }
    public boolean handle(Result result, GameEngine game)
    {
        if(result != Result.DIAMOND)
        {
            return super.handle(result, game);
        } else {
            game.getPlayer().Diamond += 1;
            return true;
        }
    }
}
