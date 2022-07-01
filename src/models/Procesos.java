package models;

public class Procesos {
    private static float perimetro1;
    private static float perimetro2;
    private static float perimetro3;
    private static float x1l = 0;
    private static float y1l = 0;
    private static float x2l = 0;
    private static float y2l = 0;
    private static float x3l = 0;
    private static float y3l = 0;
    private static float x4l = 0;
    private static float y4l = 0;
    private static float x11 = 0;
    private static float y11 = 0;
    private static float x22 = 0;
    private static float y22 = 0;
    private static float x33 = 0;
    private static float y33 = 0;
    private static float x44 = 0;
    private static float y44 = 0;
    public static float proceso1(float x1, float y1, float x2, float y2){
        float resultado1 = (float) Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        return resultado1;
    }
    public static float proceso2(float x2, float y2, float x3, float y3){
        float resultado2 = (float) Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3),2));
        return resultado2;
    }
    public static float proceso3(float x3, float y3, float x4, float y4){
        float resultado3 = (float) Math.sqrt(Math.pow((x3 - x4), 2) + Math.pow((y3 - y4), 2));
        return resultado3;
    }
    public static float proceso4(float x4, float y4, float x1, float y1){
        float resultado4 = (float) Math.sqrt(Math.pow((x4 - x1),2) + Math.pow((y4 - y1), 2));
        return resultado4;
    }
    //_--------------------------------------------------- + 4x, -3y
    public static float proc1(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4){
        float res1 = (float) Math.sqrt(Math.pow(((x2 + 4.0) - (x1 + 4.0)), 2) + Math.pow(((y2 - 3.0) - (y1 - 3.0)), 2));

        return res1;
    }
    public static float proc2(float x2, float y2, float x3, float y3){
        float res2 = (float) Math.sqrt(Math.pow(((x2 + 4.0) - (x3 + 4.00)), 2) + Math.pow(((y2 - 3.0) - (y3 - 3.0)),2));
        return res2;

    }
    public static float proc3(float x3, float y3, float x4, float y4){
        float res3 = (float) Math.sqrt(Math.pow(((x3 + 4.0) - (x4 + 4.0)),2) + Math.pow(((y3 - 3.0) - (y4 - 3.0)),2));
        return res3;
    }
    public static float proc4(float x4, float y4, float x1, float y1){
        float res4 = (float) Math.sqrt(Math.pow(((x4 + 4.0) - (x1 + 4.0)),2) + Math.pow(((4 - 3.0) - (y1 - 3.0)),2));
        return res4;
    }
    //----------------------------------------------------------------3x, 0.5y
    public static float proces1(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4){
        float res11 = (float) Math.sqrt(Math.pow(((x2 + 3) - (x1 + 3)), 2) + Math.pow(((y2 + 0.5) - (y1 + 0.5)), 2));

        return res11;
    }
    public static float proces2(float x2, float y2, float x3, float y3){
        float res22 = (float) Math.sqrt(Math.pow(((x2 + 3) - (x3 + 3)), 2) + Math.pow(((y2 + 0.5) - (y3 + 0.5)),2));
        return res22;
    }
    public static float proces3(float x3, float y3, float x4, float y4){
        float res33 = (float) Math.sqrt(Math.pow(((x3 + 3.0) - (x4 + 3.0)),2) + Math.pow(((y3 + 0.5) - (y4 + 0.5)),2));
        return res33;
    }
    public static float proces4(float x4, float y4, float x1, float y1){
        float res44 = (float) Math.sqrt(Math.pow(((x4 + 3) - (x1 + 3)),2) + Math.pow(((4 + 0.5) - (y1 - + 0.5)),2));
        return res44;
    }
    //-----------------------------------------------------------------------
    public float perimetro1(float resultado1, float resultado2, float resultado3, float resultado4){
        float perimetro1 = resultado1 + resultado2 + resultado3 + resultado4;
        return perimetro1;
    }
    public float perimetro2(float res1, float res2, float res3, float res4){
        float perimetro2 =  res1 + res2 + res3 + res4;
        return perimetro2;
    }
    public float perimetro3(float res11, float res22, float res33, float res44){
        float perimetro3 = res11 + res22 + res33 + res44;
        return perimetro3;
    }
    public static void sacar1(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4){
        x11 =  (x1 * 3);
        y11 = (float) (y1 * 0.5);
        x22 =  x2 * 3;
        y22 = (float) (y2 * 0.5);
        x33 = x3 * 3;
        y33 = (float) (y3  * 0.5);
        x44 = x4  * 3;
        y44 = (float) (y4  * 0.5);
    }

    public static void sacar2(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4){
        x1l = x1 + 4;
        y1l = y1 -3;
        x2l =  x2 + 4;
        y2l = y2 -3 ;
        x3l = x3 + 4;
        y3l = y3 - 3;
        x4l = x4  + 4;
        y4l = y4 -3;
    }

    public static float getPerimetro1() {
        return perimetro1;
    }

    public static float getPerimetro2() {
        return perimetro2;
    }

    public static float getPerimetro3() {
        return perimetro3;
    }

    public static float getX1l() {
        return x1l;
    }

    public static float getY1l() {
        return y1l;
    }

    public static float getX2l() {
        return x2l;
    }

    public static float getY2l() {
        return y2l;
    }

    public static float getX3l() {
        return x3l;
    }

    public static float getY3l() {
        return y3l;
    }

    public static float getX4l() {
        return x4l;
    }

    public static float getY4l() {
        return y4l;
    }

    public static float getX11() {
        return x11;
    }

    public static float getY11() {
        return y11;
    }

    public static float getX22() {
        return x22;
    }

    public static float getY22() {
        return y22;
    }

    public static float getX33() {
        return x33;
    }

    public static float getY33() {
        return y33;
    }

    public static float getX44() {
        return x44;
    }

    public static float getY44() {
        return y44;
    }
}
