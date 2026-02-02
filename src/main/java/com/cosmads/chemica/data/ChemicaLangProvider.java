package com.cosmads.chemica.data;

import com.cosmads.chemica.Chemica;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ChemicaLangProvider extends LanguageProvider {

    public ChemicaLangProvider(PackOutput output) {
        super(output, Chemica.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.chemica.main", "Chemica");
    }
}