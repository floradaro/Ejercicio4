
package Entidades;


public class Gato {
    private String nombre;
    private String color;
    private String raza;
    private Integer edad;
    private Boolean vivo;

    public Gato() {
    }

    public Gato(String nombre, String color, String raza, Integer edad, Boolean vivo) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.vivo = vivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", edad=" + edad + ", vivo=" + vivo + '}';
    }
    
}
