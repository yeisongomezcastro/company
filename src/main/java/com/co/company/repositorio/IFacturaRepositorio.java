package com.co.company.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.co.company.entity.FacturaEntity;

public interface IFacturaRepositorio extends CrudRepository<FacturaEntity, String> {

}
