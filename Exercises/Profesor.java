package Exercises;

/**
* Profesor
*/
public class Profesor extends Sobrecarga{
public Profesor(String nombre, String materia, int calificacion){
super(nombre, materia, calificacion);
}
public String reprobar(){
if(this.calificacion>5)
return ">sonrisa Sacaste "+this.calificacion+" en " + this.materia;
else
return "triste";
}
}
