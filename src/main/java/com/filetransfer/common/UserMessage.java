package common;

public class UserMessage extends Header {
    protected String nombre;
    protected int dni;

    protected int length;

    public UserMessage(String nombre, int dni) {

        this.type = USER;
        this.nombre = nombre;
        this.dni = dni;
    }
    public UserMessage(int dni) {

        this.type = USER;
        this.dni = dni;
    }
    public UserMessage(String nombre) {

        this.type = USER;
        this.nombre = nombre;

    }
    public UserMessage() {

        this.type = USER;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class UsuarioX{

}
