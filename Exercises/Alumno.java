package Exercises;
/**
* Alumno
*/
public class Alumno extends Sobrecarga{
public Alumno(String nombre, String materia, int calificacion){
super(nombre, materia, calificacion);
}

public String reprobar(){

if (this.calificacion<6)
return "triste";
else
return "sonrisa";

}
}
