package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int hamburguer = 0, hotDog = 0, hotSausage = 0, sausage = 0, cash;
        int users, menu, partial;
        double total,discount=0;
        System.out.println("Ingrese cuantos clientes son: ");
        users = inputData.nextInt();
        for (int i = 1; i <= users; i++) {
            System.out.println("Ingrese que plato desea pedir el cliente #" + i + " entre (1,2,3 ó 4) siendo 1.Hamburguesa, 2.Perro, 3.Salchipapas, 4.Chorizo");
             menu = inputData.nextInt();
             if (menu==1){
                 hamburguer = hamburguer+ 1;
             }
             if (menu == 2){
                 hotDog = hotDog+1;
             }
             if (menu == 3){
                 hotSausage = hotSausage + 1;
             }
             if (menu == 4){
                 sausage = sausage + 1;
             }
        }
        partial = hamburguer*10000 + hotDog*8000 + hotSausage*6000 + sausage*7000;
        if (hamburguer>=2 || hotDog>=2 || hotSausage>=2 || sausage>=2){
            discount=partial*0.05;
        }
        if(discount>0 && partial>20000){
            total = partial*0.9-discount;
        }
        if (partial>20000){
            total = partial*0.9;
        }else {
            total = partial;
        }
        System.out.println("Si desea agregar propina, ingrese el número 1 sino ingrese cualquier número");
        cash = inputData.nextInt();
        if (cash == 1){
            total = total*1.1;
        }
        System.out.println("El valor a pagar es de $"+total);
    }
}
