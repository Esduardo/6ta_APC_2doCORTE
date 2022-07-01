package models;

import javax.swing.*;

public class SalidaDatos {
    public static void imprimirPerimetro1(float perimetro1, float x1, float y1, float x2, float y2, float x3, float x4, float y4){
        //System.out.println("Perimetro 1: " + perimetro1);

        JOptionPane.showMessageDialog(null, "Perimetro" +  Procesos.getPerimetro1() +
                "\ncoordenada1: " + LecturaDatos.getX1() + " , " + LecturaDatos.getX2() +
                "\nCoordenada2: " + LecturaDatos.getX2() + " , " + LecturaDatos.getY2() +
                "\nCoordenada3: " + LecturaDatos.getX3() + " , " + LecturaDatos.getY3() +
                "\nCoordenada4: " + LecturaDatos.getX4() + " , " + LecturaDatos.getY4());

    }

    public static void imprimirPerimetro2(float perimetro2, float x1l, float y1l, float x2l, float y2l, float x3l, float y3l, float x4l, float y4l){
        //System.out.println("Perimetro 1: " + perimetro1);

        JOptionPane.showInputDialog(null , "Segundo perimetro : " + Procesos.getPerimetro2() +
        "\ncoordenada1: " + Procesos.getX1l() + " , " + Procesos.getX2l() +
        "\nCoordenada2: " + Procesos.getX2l() + " , " + Procesos.getY2l() +
                "\ncoordenada3: " + Procesos.getX3l() + " , " + Procesos.getY3l() +
                "coordenada4: " + Procesos.getX4l() + " , " + Procesos.getY4l());
    }

    public static void imprimirPerimetro3(float perimetro3, float x11, float y11, float x22, float y22, float x33, float y33, float x44, float y44){
        JOptionPane.showInputDialog(null , "Tercer perimetro : " + Procesos.getPerimetro3() +
                "\ncoordana1: " + Procesos.getX11() + " , " + Procesos.getY11() +
                "\ncoordenada2: " + Procesos.getX22() + " , " + Procesos.getY22() +
                "\ncoordenada3: " + Procesos.getX33() + " , " + Procesos.getY33() +
                "\ncoordenada4: " + Procesos.getX44() + " , " + Procesos.getY44());
    }
}
