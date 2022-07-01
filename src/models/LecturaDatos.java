package models;
import javax.swing.*;
import java.util.Scanner;

public class LecturaDatos {
    static Scanner entrada = new Scanner(System.in);
    private static float x1 = 0;
    private static float y1 = 0;
    private static float x2 = 0;
    private static float y2 = 0;
    private static float x3 = 0;
    private static float y3 = 0;
    private static float x4 = 0;
    private static float y4 = 0;
    private static int y = 1;
    private static int z = 1;
    public static void leerDatos(){
            x1 = Float.parseFloat(JOptionPane.showInputDialog(null , "Dame el lado x1"));
            y1 = Float.parseFloat(JOptionPane.showInputDialog(null , "VDame el lado y1"));

            x2 = Float.parseFloat(JOptionPane.showInputDialog(null , "Dame el lado 2X"));
            y2 = Float.parseFloat(JOptionPane.showInputDialog(null , "Dame el lado y2"));

            x3 = Float.parseFloat(JOptionPane.showInputDialog(null , "Dame el lado x3"));
            y3 = Float.parseFloat(JOptionPane.showInputDialog(null , "Dame el lado y3"));

            x4 = Float.parseFloat(JOptionPane.showInputDialog(null , "Dame el lado x4"));
            y4 = Float.parseFloat(JOptionPane.showInputDialog(null , "Dame el lado y4"));

    }

    public static Scanner getEntrada() {
        return entrada;
    }

    public static float getX1() {
        return x1;
    }

    public static float getY1() {
        return y1;
    }

    public static float getX2() {
        return x2;
    }

    public static float getY2() {
        return y2;
    }

    public static float getX3() {
        return x3;
    }

    public static float getY3() {
        return y3;
    }

    public static float getX4() {
        return x4;
    }

    public static float getY4() {
        return y4;
    }
}
