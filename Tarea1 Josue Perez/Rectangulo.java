// Josue Jonathan Perez Valenzuela 
public class Rectangulo{
    private double altura;
    private double base;
    private String color;
    private Punto centro;
    public Rectangulo (double altura1,double base1, String color1,Punto centro1){
       altura = altura1;
       base = base1;
       centro = centro1;
       color = color1;
    }
    public double calcularPerimetro(){
        double perimetro = 2 * altura + 2 * base;
        return perimetro; 
    }
    public double calclarArea(){
        double area = altura * base;
        return area;
    }
    public Punto puntoSupDere(){
      double coorX = (base / 2) + centro.getcoorX();
      double coorY = (altura / 2) + centro.getcoorY();
      return new Punto (coorX, coorY);
    }
    public String color(){
        return color;
    }
    double getaltura1(){
        return altura;
    }
    double getbase1(){
        return base;
    }
    String getcolor1(){
        return color;
    }
    Punto getcentro1(){
        return centro;
    }
    void setaltura1(double alturaNueva){
        this.altura = alturaNueva;
    }
    void setbase1(double baseNueva){
        this.base = baseNueva;
    }
    void setcentro1(Punto centroNuevo){
        this.centro = centroNuevo;
    }
    void setcolor1(String colorNuevo){
        this.color = colorNuevo;
    }
}
