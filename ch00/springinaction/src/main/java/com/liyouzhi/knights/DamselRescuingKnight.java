package com.liyouzhi.knights;

public class DamselRescuingKnight implements knight{
    private RescueDamselQuest quest;
    
    DamselRescuingKnight(){
        quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() throws Exception{
        quest.embark();
    }
}