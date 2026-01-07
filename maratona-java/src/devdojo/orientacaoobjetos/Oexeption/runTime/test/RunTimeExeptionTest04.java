package devdojo.orientacaoobjetos.Oexeption.runTime.test;

import java.io.FileNotFoundException;
import java.security.PrivilegedActionException;
import java.sql.SQLException;

public class RunTimeExeptionTest04 {
    public static void main(String[] args) {

        //Exceç~es mais generiacas sempre no final pois todas às exceções usadas abaixo são do tipo RunTimeExeption, se colocarmos um catch de RunTime primeiro sempre a exceção vai ser essa pois todas elas são RunTime

         try{
            throw new RuntimeException();
         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Dentro do ArrayIndexOutOfBoundsException");
         }catch (IndexOutOfBoundsException e){
             System.out.println("Dentro do IndexOutOfBoundsException");
         }catch (IllegalArgumentException e){
             System.out.println("Dentro do IllegalArgumentException");
         }catch (ArithmeticException e){
             System.out.println("Dentro do ArithmeticException");
         }catch (RuntimeException e){ // Exceção mais generica por ultimo
             System.out.println("Dentro do RuntimeException");
         }

         try {
             talvezLanceException();
         } catch (SQLException | FileNotFoundException throwables){
             throwables.printStackTrace();
         }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}

