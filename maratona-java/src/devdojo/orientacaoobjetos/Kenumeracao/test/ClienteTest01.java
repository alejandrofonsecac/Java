package devdojo.orientacaoobjetos.Kenumeracao.test;

import com.sun.security.ntlm.Client;
import devdojo.orientacaoobjetos.Kenumeracao.dominio.Cliente;
import devdojo.orientacaoobjetos.Kenumeracao.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alejandro", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Arthur", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Julia", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Laura", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
