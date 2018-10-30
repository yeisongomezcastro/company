package com.co.company.service;

import java.util.Date;
import java.util.List;

import com.co.company.entity.PedidosEntity;

public interface IOperarioServicio {
	public PedidosEntity consultarPedidoByNroPedido(String nroPedido);
	public void registrarPedido(PedidosEntity pedido);
	public List<PedidosEntity> consultarPedidosByFechaPedido(Date fechaPedido);
	public void eliminarPedido(PedidosEntity pedido);

}
