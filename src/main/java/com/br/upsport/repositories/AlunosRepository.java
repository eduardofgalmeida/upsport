package com.br.upsport.repositories;

import com.br.upsport.models.AlunosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunosRepository extends JpaRepository<AlunosModel, Long> {



}
