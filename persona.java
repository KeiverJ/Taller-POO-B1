import java.util.Random;

public class persona {
    private String nombre;
    private int edad;
    private String cedula;
    private char sexo;
    private float peso;
    private float altura;

    public persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = this.generarCedula();
        this.peso = 0;
        this.altura = 0;
    }


    
    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public String getCedula() {
        return cedula;
    }


    public char getSexo() {
        return sexo;
    }


    public float getPeso() {
        return peso;
    }


    public float getAltura() {
        return altura;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public void setPeso(float peso) {
        this.peso = peso;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double calcularIMC (){
        double IMC = this.peso/Math.pow(this.altura,2);
        if (IMC < 20){
            return -1;
        } else if (IMC >= 20 && IMC <= 25){
            return 0;
        } else {
            return 1;
        }
    }

    public boolean EsMayorDeEdad(){
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public char comprobarSexo (char sexo){
        if (sexo == 'H' || sexo == 'M'){
            return sexo;
        } else {
            return 'H';
        }
    }

    public String generarCedula (){
        Random aleatorio = new Random(System.currentTimeMillis());
        int numero = aleatorio.nextInt(1000000000)+1000000000;
        return numero+"";
    }

    public String toString() {
        return "persona [nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso="
                + peso + ", altura=" + altura + "]";
    }

}
