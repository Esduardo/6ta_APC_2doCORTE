import models.LecturaDatos;
import models.Procesos;
import models.SalidaDatos;

import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String [] srgs){
        Scanner entrada = new Scanner(System.in);
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "POLIGONO DE 4 VERTICES" +
                    "\n1. Ingresar Datos" +
                    "\n2. Perimetro y coordendas" +
                    "\n3. Recorrido x + 4, y-3"));
            switch (opc){
                case 1:
                    LecturaDatos.leerDatos();
                    break;
                case 2:
                    SalidaDatos.imprimirPerimetro1(Procesos.getPerimetro1(), LecturaDatos.getX1(), LecturaDatos.getY1(), LecturaDatos.getX2(), LecturaDatos.getY2(), LecturaDatos.getX3(),  LecturaDatos.getX4(), LecturaDatos.getY4());
                    break;
                case 3:
                    SalidaDatos.imprimirPerimetro2(Procesos.getPerimetro2(), Procesos.getX1l(), Procesos.getY1l(), Procesos.getX2l(), Procesos.getY2l(), Procesos.getX3l(), Procesos.getY3l(), Procesos.getX4l(), Procesos.getY4l());
                    break;
                case 4:
                    SalidaDatos.imprimirPerimetro3(Procesos.getPerimetro3(), Procesos.getX11(), Procesos.getY11(), Procesos.getX22(), Procesos.getY22(), Procesos.getX33(), Procesos.getY33(), Procesos.getX44(), Procesos.getY44());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Bye...");
                    break;
                default: Integer.parseInt(JOptionPane.showInputDialog(null, "no existe :["));
            }
        }while(opc != 5);
    }
}
