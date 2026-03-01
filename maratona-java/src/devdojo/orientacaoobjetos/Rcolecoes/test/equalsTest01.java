package devdojo.orientacaoobjetos.Rcolecoes.test;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import devdojo.orientacaoobjetos.Rcolecoes.dominio.SmartPhone;

public class equalsTest01 {
    public static void main(String[] args) {
        SmartPhone  s1 = new SmartPhone("1ABC1", "iPhone");
        SmartPhone  s2 = new SmartPhone("1ABC1", "iPhone");
        System.out.println(s1.equals(s2));
    }
}
