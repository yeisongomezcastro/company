package com.co.company.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.co.company.entity.PaisEntity;

public interface IPaisRepositorio  extends CrudRepository<PaisEntity, String> {

}
