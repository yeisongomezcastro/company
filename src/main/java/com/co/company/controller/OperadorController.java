package com.co.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.company.entity.PedidosEntity;
import com.co.company.service.IOperarioServicio;



@RestController
@RequestMapping("/api/company")
@CrossOrigin(origins = "*", maxAge = 3600)
public class OperadorController {
	@Autowired
	private IOperarioServicio operadorServicio;
	
	@GetMapping(value = "/obtener/{nroPedido}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<PedidosEntity> getPedidoByNroPedido(@PathVariable("nroPedido") String pedido) {
		return (List<PedidosEntity>) operadorServicio.consultarPedidoByNroPedido(pedido);
	}

}
