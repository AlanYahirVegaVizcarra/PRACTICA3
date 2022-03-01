import java.util.Scanner;


public class Alumno2{
    private String nom;
    private String id;
    private String mat;
    private String est;
    private float cal;

    /* Aqui van los contstructores */

    public Alumno2(String id, String nom, String mat, float cal) {
        this.nom = nom;
        this.id = id;
        this.mat = mat;
        this.cal = cal;
        this.est = this.Estado(cal);
    }

    public Alumno2() {
        this.nom = null;
        this.id = null;
        this.mat = null;
        this.cal = 0f;
        this.est = null;
    }

    public void asignarName(Scanner sc) {
        System.out.println("Alumno:");
        System.out.print("ID:");
        this.id = sc.next();
        System.out.print("Nombre:");
        this.nom = sc.next();
        System.out.print("Materia:");
        this.mat = sc.next();
        System.out.print("Calificación:");
        this.cal = sc.nextFloat();
        this.asignarEstado();
    }

    private String Estado(float cal) {
        return (cal >= 60 ? "Aprobado" : "reprobado");
    }

    private String Estado() {
        return Estado(this.cal);
    }
/* Aqui empiezan los metodos */
    public void asignarEstado() {
        this.est = this.Estado();
    }

    @Override
    public String toString() {
        return "Alumno:" + " id:" + id + ", nombre:" + nom + ", materia:" + mat + ", estado:" + est + ", calificacion:" + cal;
    }

    public String getNombre() {
        return nom;
    }

    public void setNombre(String nom) {
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMateria() {
        return mat;
    }

    public void setMateria(String mat) {
        this.mat = mat;
    }

    public String getEstado() {
        return est;
    }

    public void setEstado(String est) {
        this.est = est;
    }

    public float getCalificación() {
        return cal;
    }

    public void setCalificación(float cal) {
        this.cal = cal;
    }

}

