package com.co.company.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.co.company.entity.DepartamentoEntity;

public interface IDepartamentoRepositorio  extends CrudRepository<DepartamentoEntity, String> {

}
