package Biblioteca_Manga.service;

import Biblioteca_Manga.dataBase.dataBase;
import Biblioteca_Manga.dominio.Cliente;

public class PedidoService {
    public static void processarPedido(){
        Cliente cliente = dataBase.filaClientes.poll();

        if (cliente == null){
            System.out.println("Nenhum pedido na fila");
            return;
        }

        System.out.println("Processando pedido do cliente: " + cliente.getNome());
    }
}
