package com.example.responsibillitychain.Logic;


import com.example.responsibillitychain.Handlers.*;
import com.example.responsibillitychain.Models.Handler;
import com.example.responsibillitychain.Models.Result;

public class ActionChain {
    Handler chain;
    public ActionChain() {
        buildChain();

    }
    private void buildChain() {
        chain = new GroundHandler( new LavaHandler(new HealthHandler(new RedstoneHandler(new DiamondHandler(new GoldHandler(null))))));
    }
    public Handler getChain()
    {
        return chain;
    }
    public void handle(Result result, GameEngine gameEngine)
    {
        chain.handle(result,gameEngine);
    }
}