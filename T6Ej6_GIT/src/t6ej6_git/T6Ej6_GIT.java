/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6ej6_git;
import java.util.*;

/**
 *
 * @author admin
 */
public class T6Ej6_GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temperaturas[] = new double[7];
        String diasSemana[]={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        double suma = 0;
        boolean practica = false;
        int dia,opc;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Anota temperatura de la semana");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(diasSemana[i] + ":");
            temperaturas[i] = sc.nextDouble();
            suma = suma + temperaturas[i];
        }

        System.out.println("La temperatura media ha sido:" + suma / 7);

        do {
            System.out.println("Anota día del que quieras saber la temperatura:");
            dia = sc.nextInt();
        } while (dia<1 || dia>7);
        
        do{
        System.out.println("¿Quieres seguir modificando? (1.SI / 2.NO)");
        opc= sc.nextInt();
        if(opc==1){
            System.out.println("Puedes seguir modificando el programa");
        }else{
            System.out.println("Ya no puedes seguir modificando el programa");
        }
        }while(opc!=2);
        System.out.println("La temperatura fue "+ temperaturas[dia-1] );
    }
    
}
