package lab2_alessandroreyes_11911224;


public class Universidad {
    String NombreU;
    String NombreR;
    String Sucursal;
    int Año;
    int NumM;
    int NumE;
    int Costo;
    int Nivel;
    
    public Universidad(){
        
    }
    public Universidad(String nombreu){
        NombreU = nombreu;
    }
    public Universidad(String nombreu, String nombrer, String sucursal, int año, int numm, int nume, int costo, int nivel){
        NombreU = nombreu;
        NombreR = nombrer;
        Sucursal = sucursal;
        Año = año;
        NumM = numm;
        NumE = nume;
        Costo = costo;
        Nivel = nivel;
    }
    
    public String getNombreU() {
        return NombreU;
    }

    public void setNombreU(String NombreU) {
        this.NombreU = NombreU;
    }

    public String getNombreR() {
        return NombreR;
    }

    public void setNombreR(String NombreR) {
        this.NombreR = NombreR;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public int getNumM() {
        return NumM;
    }

    public void setNumM(int NumM) {
        this.NumM = NumM;
    }

    public int getNumE() {
        return NumE;
    }

    public void setNumE(int NumE) {
        this.NumE = NumE;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    @Override
    public String toString() {
        return "Nombre de la universidad:" + NombreU + "\n Nombre del rector:" + NombreR + "\n Sucursal: " + Sucursal + "\n Año:" + Año + "\n cantidad de maestros= " + NumM + ", NumE=" + NumE + "\n Costo=" + Costo + "\n Nivel: " + Nivel;
    }
    
}
