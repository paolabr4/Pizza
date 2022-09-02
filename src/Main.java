import javax.swing.*;

public class Main {

    public static void main(String[] args) {



        int pizzas;
        int elementos=7;

        pizzas= Integer.parseInt(JOptionPane.showInputDialog("Cuantas Pizzas desea llevar?  "));
        int [][] factura = new int [pizzas][elementos];

        int cantidadIng;
        int opc;

        for(int i=0;i<pizzas;i++)
        {
            int ing=0;
            factura[i][ing] = i+1;
            JOptionPane.showMessageDialog(null,"Pizza # "+(i+1));
            cantidadIng=Integer.parseInt(JOptionPane.showInputDialog("Cuantos ingredientes vas a agregar a tu pizza"));


            for(ing=1;ing<=cantidadIng;ing++)
            {
                System.out.println("Ingrediente # " +(ing+1));
                System.out.println("INGREDIENTES DISPONIBLES");
                System.out.println("Opcion 1=  JAMON");
                System.out.println("Opcion 2=  PEPERONI");
                System.out.println("Opcion 3=  POLLO");
                System.out.println("Opcion 4=  TOMATE");
                System.out.println("Opcion 5=  ATUN");
                System.out.println("Opcion 6=  ALBAHACA");
                System.out.println("Opcion 7=  CHAMPIÑON");

                opc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ingrediente # "+ing));

                if(opc==1) {
                    factura[i][ing] =500;
                }else if(opc==2){
                    factura[i][ing]=900;
                }else if(opc==3){
                    factura[i][ing]=700;
                }else if(opc==4){
                    factura[i][ing]=300;
                }else if(opc==5){
                    factura[i][ing]=1200;
                }else if(opc==6){
                    factura[i][ing]=400;
                }else if(opc==7){
                    factura[i][ing]=800;
                }
            }
            factura[i][5]=5000; //Base
            factura[i][6]=factura[i][1]+factura[i][2]+factura[i][3]+factura[i][4]+factura[i][5];   //Total

            System.out.println("llenado");
        }

        int total=0;
        for(int j=0;j<pizzas;j++){
          total=total+(factura[j][6]);
        }

        System.out.println("Totales");
        //mostrar pedido

        System.out.println("PIZZA,  TOP 1 ,  TOP 2  ,  TOP 3  ,  TOP 4  ,  BASE   , TOTAL X PIZZA");
        for(int p=0;p<pizzas;p++){
            for(int e=0;e<elementos;e++){
                System.out.print("|  "+factura[p][e]+"  |");
            }
            System.out.println(" ");
            System.out.println("----------------------------------------------------");
        }

        JOptionPane.showMessageDialog(null,"El total de su compra es: "+total);
    }

}
