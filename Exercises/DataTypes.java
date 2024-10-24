package Exercises;

public class DataTypes {
public String cadena;
public int entero;
public float flotante;
public char caracter;
public boolean boleano;

public DataTypes() {
this.cadena = "";
this.entero = 0;
this.flotante = 0.0f;
this.caracter = '\u0000';
this.boleano = false;
}


public DataTypes(String cadena, int entero, float flotante, char caracter, boolean boleano){
this.cadena = "Hola mundo";
this.entero = 10;
this.flotante = 5.9f;
this.caracter = 'A';
this.boleano = true;
}

public String cadena(){
return cadena;
}

public int entero(){
return entero;
}

public float flotante(){
return flotante;
}

public char caracter(){
return caracter;
}

public boolean boleano(){
return boleano;
}

}
