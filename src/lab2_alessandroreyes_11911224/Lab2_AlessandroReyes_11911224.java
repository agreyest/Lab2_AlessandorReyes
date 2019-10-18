package lab2_alessandroreyes_11911224;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class Lab2_AlessandroReyes_11911224 {
    public static Scanner leer = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        char resp='s';
        String user, usuario = "leobanegas";
        String pw=" ", contra = "99";
        ArrayList lista = new ArrayList();
        while(resp == 's'){
            System.out.println("1. Crear Universidad"
                    + "\n2. Eliminar Universidad"
                    + "\n3. Log In"
                    + "\n4. Ascender Universidad"
                    + "\n5. Listar universidades y su sucursal"
                    + "\n6. Modificar Universidad"
                    + "\n7. Descender Universidad"
                    + "\n8. RANDOM: ");
            int menu = leer.nextInt();
            switch(menu){
                case 1:
                    if(pw.equals(contra)){
                        System.out.print("Ingrese el nombre de la universidad: ");
                        String nombre = leer.next();
                        System.out.print("Ingrese el nombre del rector: ");
                        String rector = leer.next();
                        System.out.print("Ingrese la sucursal: ");
                        String sucursal = leer.next();
                        System.out.println("Año de creacion: ");
                        int año = leer.nextInt();
                        System.out.print("Cuantos maestros hay: ");
                        int maestros = leer.nextInt();
                        System.out.print("Cuantos estudiantes hay: ");
                        int estudiantes = leer.nextInt();
                        System.out.print("Cual es el nivel de la universidad:"
                                + "\n 1. publica"
                                + "\n 4. privada");
                        int nivel = leer.nextInt();
                        int costo;
                        if(nivel == 1){
                            costo = 0;
                        }else{
                            costo = 6000;
                        }
                        Universidad U = new Universidad();
                        U.setNombreU(nombre);
                        U.setNombreR(rector);
                        U.setSucursal(sucursal);
                        U.setAño(año);
                        U.setNumM(maestros);
                        U.setNumE(estudiantes);
                        U.setNivel(nivel);
                        U.setCosto(costo);
                        lista.add(U);
                    }
                    break;
                case 2:
                    String salida = " ";
                    for (Object t : lista) {
                        salida += "" + lista.indexOf(t) + ") " + t + "\n";
                    }
                    System.out.print("Que universidad desea eliminar: ");
                    int pos = leer.nextInt();
                    if (pos > lista.size()) {
                        System.out.println("posicion incorrecta.");
                    } else {
                        lista.remove(pos);
                        System.out.println("Eliminada.");

                    }
                    break;
                case 3:
                    System.out.print("Ingrese el usuario: ");
                    user = leer.next();
                    if(user.equals(usuario)){
                        System.out.print("Ingrese la contraseña: ");
                        pw = leer.next();
                        if(pw.equals(contra)){
                            break;
                        }else{
                            pw = " ";
                        }
                    }else{
                        user = " ";
                        break;
                    }
                        
                    break;
                case 4:
                    
                    salida = " ";
                    for (Object t : lista) {
                        salida += "" + lista.indexOf(t) + ") " + t + "\n";
                    }
                    System.out.print("Que universidad desea ascender: ");
                    pos = leer.nextInt();
                    if (((Universidad) lista.get(pos)).getNivel() == 1) {
                        ((Universidad) lista.get(pos)).setNivel(2);
                        ((Universidad) lista.get(pos)).setCosto(200);
                    } else if (((Universidad) lista.get(pos)).getNivel() == 2) {
                        int temp = 0;
                        for (Object t : lista) {
                            if (((Universidad) lista.get(lista.indexOf(t))).getNivel() == 3) {
                                temp++;
                            }
                        }
                        if (temp > 0) {
                            break;
                        } else {
                            ((Universidad) lista.get(pos)).setNivel(3);
                            ((Universidad) lista.get(pos)).setCosto(500);
                        }
                    } else if (((Universidad) lista.get(pos)).getNivel() == 4) {
                        ((Universidad) lista.get(pos)).setNivel(5);
                        ((Universidad) lista.get(pos)).setCosto(12000);
                    }
                    
                    break;
                case 5:
                    salida=" ";
                    for (Object t : lista) {
                        salida += "" + lista.indexOf(t) + ") Universidad: " + ( (Universidad)lista.get(lista.indexOf(t)) ).getNombreU()+ " Sucursal: "+ ( (Universidad)lista.get(lista.indexOf(t)) ).getSucursal()+ "\n";

                    }
                    break;
                case 6:
                    salida = " ";
                    for (Object t : lista) {
                        salida += "" + lista.indexOf(t) + ") " + t + "\n";
                    }
                    System.out.print("Que universidad desea modificar: ");
                    pos = leer.nextInt();
                    System.out.print("Que desea moficiar de esta universidad: "
                            + "\n1) Nombre de la universdiad"
                            + "\n2) NOmbre del rector"
                            + "\n3) la Sucursal"
                            + "\n4) el año"
                            + "\n5) Cantidad de maestros"
                            + "\n6) cantidad de estudiantes: ");
                    int opcion = leer.nextInt();
                    if(opcion == 1){
                        System.out.print("Ingrese el nombre de la universidad: ");
                        String nombre = leer.next();
                    }else if(opcion == 2){
                        System.out.print("Ingrese el nombre del rector: ");
                        String rector = leer.next();
                    }else if(opcion == 3){
                        System.out.print("Ingrese la sucursal: ");
                        String sucursal = leer.next();
                    }else if(opcion == 4){
                        System.out.println("Año de creacion: ");
                        int año = leer.nextInt();
                    }else if(opcion == 5){
                        System.out.print("Cuantos maestros hay: ");
                        int maestros = leer.nextInt();
                    }else if(opcion == 6){
                        System.out.print("Cuantos estudiantes hay: ");
                        int estudiantes = leer.nextInt();
                    }
                    break;
                case 7:
                    salida = " ";
                    for (Object t : lista) {
                        salida += "" + lista.indexOf(t) + ") " + t + "\n";
                    }
                    System.out.print("Que universidad desea descender: ");
                    pos = leer.nextInt();
                    if (((Universidad) lista.get(pos)).getNivel() == 1) {
                        lista.remove(pos);
                    } else if (((Universidad) lista.get(pos)).getNivel() == 2) {
                        ((Universidad)lista.get(pos)).setNivel(1);
                        ((Universidad) lista.get(pos)).setCosto(0);
                    } else if (((Universidad) lista.get(pos)).getNivel() == 3) {
                        ((Universidad) lista.get(pos)).setNivel(2);
                        ((Universidad) lista.get(pos)).setCosto(200);
                    } else if (((Universidad) lista.get(pos)).getNivel() == 4) {
                        lista.remove(pos);
                    } else if (((Universidad) lista.get(pos)).getNivel() == 5) {
                        ((Universidad) lista.get(pos)).setNivel(4);
                        ((Universidad) lista.get(pos)).setCosto(6000);
                    }
                    break;
                case 8:
                    pos = 0 + random.nextInt(lista.size()-1);
                    if (((Universidad) lista.get(pos)).getNivel() == 2) {
                        for (Object t : lista) {
                            if (((Universidad) lista.get(lista.indexOf(t))).getNivel() == 3) {
                                ((Universidad) lista.get(lista.indexOf(t))).setNivel(2);
                                ((Universidad) lista.get(lista.indexOf(t))).setCosto(200);
                            }
                        }
                        ((Universidad) lista.get(pos)).setNivel(3);
                        ((Universidad) lista.get(pos)).setCosto(500);
                        
                    }
                    break;
                default:
            }
        }
        
    }//Fin del main
    
}//fin del public class
