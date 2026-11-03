package com.example.ww2modpack.gui;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

public class WW2ScreenHandler extends ScreenHandler {
    protected WW2ScreenHandler(ScreenHandlerType<?> type, int syncId) {
        super(type, syncId);
    }

    @Override
    public boolean canUse() {
        return true;
    }
}