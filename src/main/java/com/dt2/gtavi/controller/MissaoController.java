package com.dt2.gtavi.controller;

import com.dt2.gtavi.entities.Missao;
import com.dt2.gtavi.repository.MissaoRepository;
public class MissaoController {

    private final MissaoRepository repository;
    public MissaoController(MissaoRepository repository) {
        this.repository = repository;
    }


}
