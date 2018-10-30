package com.co.company.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.co.company.entity.CiudadEntity;

public interface ICiudadRepositorio  extends CrudRepository<CiudadEntity,String> {

}
