package com.co.company.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.co.company.entity.TipoVentaEntity;

public interface ITipoVenta  extends CrudRepository<TipoVentaEntity, String> {

}
