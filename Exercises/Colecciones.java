package Exercises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;


public class Colecciones {
ArrayList cars ;
String[] bikes;
Set bicicles;
public HashMap transport;

public Colecciones(){
this.cars = new ArrayList();
this.bikes = new String[10];
this.bicicles = new HashSet();
this.transport= new HashMap();
}

public void inicializar(){
//carros
cars.add("VW Vento");
cars.add("Nisan Versa");
cars.add("Ford Fiesta");
cars.add("Mazda 2");
//motos
this.bikes[1]="Yamaha V-Star 250";
this.bikes[2]="Royal Enfield Meteor 350";
this.bikes[3]="Kawasaki Eliminator";
this.bikes[4]="Honda CMX500A2 SE Rebel.";
//bicicletas
this.bicicles.add("TREK MADONE 7 DIAMOND");
this.bicicles.add("TREK MADONE 7 DIAMOND");
this.bicicles.add("TREK MADONE 7 DIAMOND");
this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
}

public HashMap obtenerHash(){
int length = cars.size() + bikes.length + bicicles.size();// obtener tamaño
int count = 1;

for (String car : cars) {
if (car != null && !car.isEmpty()) {
transport.put(count++, car);
}
}

for (String bike : bikes) {
if (bike != null && !bike.isEmpty()) {
transport.put(count++, bike);
}
}

for (String bicicle : bicicles) {
if (bicicle != null && !bicicle.isEmpty()) {
transport.put(count++, bicicle);
}
}

transport.forEach((key, value) -> System.out.println(key + " " + value));

return this.transport;
}

}
