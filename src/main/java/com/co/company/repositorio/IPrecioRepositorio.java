package com.co.company.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.co.company.entity.PrecioEntity;

public interface IPrecioRepositorio  extends CrudRepository<PrecioEntity, String> {

}
