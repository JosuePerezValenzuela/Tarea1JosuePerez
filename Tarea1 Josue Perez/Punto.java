public class Punto
{
    private double coordenadaX;
    private double coordenadaY;
    public Punto(double puntoX,double puntoY){
        coordenadaX = puntoX;
        coordenadaY = puntoY;
    }
    public double getcoorX(){
        return coordenadaX;
    }
    public double getcoorY(){
        return coordenadaY;
    }
}