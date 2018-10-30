package com.co.company.service.imp;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Qualifier;

import com.co.company.entity.PedidosEntity;
import com.co.company.repositorio.IPedidoRepositorio;
import com.co.company.service.IOperarioServicio;

public class OperarioServicioIMP implements IOperarioServicio {
	
	@Qualifier
	private IPedidoRepositorio pedidoRepositorio;
	
	@Override
	public PedidosEntity consultarPedidoByNroPedido(String nroPedido) {
		return pedidoRepositorio.findById(nroPedido).get();
	}

	@Override
	public void registrarPedido(PedidosEntity pedido) {
		pedidoRepositorio.save(pedido);
	}

	@Override
	public List<PedidosEntity> consultarPedidosByFechaPedido(Date fechaPedido) {
		return null/**pedidoRepositorio.findByFechaPedido(fechaPedido)**/;
	}

	@Override
	public void eliminarPedido(PedidosEntity pedido) {
		pedidoRepositorio.delete(pedido);

	}

}
