package com.cosmads.chemica;

import com.cosmads.chemica.registry.rutile.runtime.ChemicaMaterialRecipes;
import dev.metallurgists.rutile.api.plugin.IRutilePlugin;
import dev.metallurgists.rutile.api.plugin.PluginConfig;
import dev.metallurgists.rutile.api.plugin.RutilePlugin;

@SuppressWarnings("unused")
@RutilePlugin
public class ChemicaRutilePlugin implements IRutilePlugin {

    @Override
    public void configure(PluginConfig config) {
        config.setModId(Chemica.MOD_ID);
        config.setRegistrate(Chemica.registrate());
        config.setRuntimeMaterialRecipes(new ChemicaMaterialRecipes());
    }


}
