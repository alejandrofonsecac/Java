package javacore.orientacaoobjetos.Zconcorrencia.test;


import javacore.orientacaoobjetos.Zconcorrencia.domain.Members;
import javacore.orientacaoobjetos.Zconcorrencia.service.emailDeliveryService;


import javax.swing.*;

public class emailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread joao = new Thread(new emailDeliveryService(members), "Joao");
        Thread lucas = new Thread(new emailDeliveryService(members), "Lucas");

        joao.start();
        lucas.start();

        while (true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMembeEmail(email);
        }
    }
}
