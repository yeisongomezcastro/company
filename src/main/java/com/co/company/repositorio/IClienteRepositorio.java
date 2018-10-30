package com.co.company.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.co.company.entity.ClienteEntity;

public interface IClienteRepositorio  extends CrudRepository<ClienteEntity, String> {

}
