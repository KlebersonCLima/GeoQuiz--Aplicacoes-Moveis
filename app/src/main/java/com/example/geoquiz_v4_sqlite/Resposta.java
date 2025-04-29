package com.example.geoquiz_v4_sqlite;

import java.util.UUID;

public class Resposta {

    private String mUUIDQuestao;
    private boolean mRespostaCorreta;
    private String mRespostaOferecida;
    private boolean mColou;

    // Construtor da classe Resposta
    public Resposta(String textoRespostaID, boolean respostaCorreta, String respostaOferecida, boolean colou) {

        this.mUUIDQuestao = textoRespostaID;
        this.mRespostaCorreta = respostaCorreta;
        this.mRespostaOferecida = respostaOferecida;
        this.mColou = colou;
    }

    public String getUUIDQuestao(){
        return mUUIDQuestao;
    }

    public boolean isRespostaCorreta(){
        return  mColou;
    }

    public String getRespostaOferecida() {
        return mRespostaOferecida;
    }

    public boolean isColou() {
        return mColou;
    }
}

