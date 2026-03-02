package devdojo.orientacaoobjetos.Rcolecoes.test;

import devdojo.orientacaoobjetos.Rcolecoes.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmarthPhoneListTest01 {
    public static void main(String[] args) {

        // {1} Ele vai retornar 2 pois qando o s1 e apagado pelo .clear() ele detecta como se o s1 ainda fosse a posição 0, assim quando o s2 for adicionado o index dele sera 1.

        SmartPhone s1 = new SmartPhone("1ABC2", "iPhone");
        SmartPhone s2 = new SmartPhone("12345", "Xiomi");
        SmartPhone s3 = new SmartPhone("22222", "Samsung");
        SmartPhone s4 = new SmartPhone("33333", "MultiLaser");
        SmartPhone s5 = new SmartPhone("33333", "Pixel");

        List<SmartPhone> smartPhones = new ArrayList<>(6);
        // 0, 1, 2, 3
        smartPhones.add(s1);
        smartPhones.clear();
        smartPhones.add(s2);
        smartPhones.add(s3);
        smartPhones.add(s4);
        smartPhones.add( 0, s5); // index do s5 ira ser 0

        for (SmartPhone smartphones : smartPhones){
            System.out.println(smartphones);
        }

        System.out.println(smartPhones.contains(s1)); //return false
        System.out.println(s4.equals(s2));
        int indexSmartPhoneS3 = smartPhones.indexOf(s3); // {1}

        System.out.println(indexSmartPhoneS3);
        System.out.println(smartPhones.get(indexSmartPhoneS3));
    }
}
