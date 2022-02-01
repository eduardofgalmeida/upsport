package com.br.upsport.services;

import com.br.upsport.models.AlunosModel;
import com.br.upsport.repositories.AlunosRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AlunosService {

    @Autowired
    AlunosRepository alunosRepository;

    public AlunosModel saveAlunos(AlunosModel alunosModel){
        alunosModel.setNome("Eduardo");

        return alunosRepository.save(alunosModel);
    }

}
