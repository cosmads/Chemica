package io.github.cosmads.chemica.core;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

public class ChemicaMixinConnector implements IMixinConnector {
    @Override
    public void connect() {
        Mixins.addConfiguration("chemica.mixins.json");
    }
}