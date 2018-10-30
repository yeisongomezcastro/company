package com.co.company.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.co.company.entity.PedidosEntity;

public interface IPedidoRepositorio extends CrudRepository<PedidosEntity, String>{

}
