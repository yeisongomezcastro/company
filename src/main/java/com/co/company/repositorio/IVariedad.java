package com.co.company.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.co.company.entity.VariedadEntity;

public interface IVariedad  extends CrudRepository<VariedadEntity, String> {

}
