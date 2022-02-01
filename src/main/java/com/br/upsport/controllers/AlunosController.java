package com.br.upsport.controllers;


import com.br.upsport.dtos.AlunosDto;
import com.br.upsport.models.AlunosModel;
import com.br.upsport.repositories.AlunosRepository;
import com.br.upsport.services.AlunosService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class AlunosController {

    @Autowired
    AlunosRepository alunosRepository;

    @Autowired
    AlunosService alunosService;

    @PostMapping("/add-aluno")
    public AlunosModel cadastrarAluno(@RequestBody AlunosModel alunosModel){
        AlunosModel result = new AlunosModel();

        try{
         alunosModel = alunosService.saveAlunos(alunosModel);
        } catch (Exception e) {

        }
        return result;
    }

    @ResponseBody
    @GetMapping("/listall")
    public List<AlunosModel> retornarAluno(){
        List<AlunosModel> ltResult = null;

        try{
            ltResult = alunosRepository.findAll();
        } catch (Exception e) {

        }
        return ltResult;
    }

}
