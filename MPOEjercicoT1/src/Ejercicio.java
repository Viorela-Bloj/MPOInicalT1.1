import java.util.Scanner;
//1.Introducir valores.
//2.Guardar en variables.
public class Ejercicio {
    private Scanner lecturaTeclado;

    public void ejercico1(){
        lecturaTeclado = new Scanner(System.in);
        // Esto de arriba es un grupo de datos, esto permite sacarlo del sistema.
        System.out.println("Cuantos bocatas vais a pedir");
        int numeroBocatas = lecturaTeclado.nextInt();
        System.out.println("Cuantas bebidas vais a pedir");
        int numeroBebidas = lecturaTeclado.nextInt();
        System.out.println("Cuanto cuesta cada bocata");
        double precioBocata = lecturaTeclado.nextDouble();
        System.out.println("Cuanto cuesta cada bebida");
        double precioBebida = lecturaTeclado.nextDouble();
        System.out.println("Cuantas personas entran en la cuenta");
        int personas = lecturaTeclado.nextInt();

    //3. Ralizar calculos.
        double precioBocatas = numeroBocatas*precioBocata;
        double precioBebidas = numeroBebidas*precioBebida;
        double costeTotal = precioBocatas+precioBebidas;
        double precioPersona = costeTotal/personas;
        // int/int-> int
    //4. Mostrar datos.
        System.out.println("El precio de las bocatas es %.2%n " +precioBocatas);
        System.out.println("El precio de las bebidas es %.2%n "+precioBebidas);
        System.out.println("El precio total es %.2%n "+costeTotal);
        System.out.println("El precio por persona es %.2%n "+precioPersona);
        //Se pone %f, para que el resultado de consola sea decimal largo...
        // Se pone %f%n, el %n es para salto de línea, y no este toda junto en la consola.
        // Se pone %.2, el .2 consite que los decimales solo haya 2.
        lecturaTeclado.close();
        // Es recomendado ya que inicias un grupo de datos, cerrarlo.
        lecturaTeclado = null;
    }
    //EJERCIOS 4
    public void ejercios4(){
        //1. Pedior datos.
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Cuantos segundos quieres pasar a tiempo");
        int segundosTotal = lecturaTeclado.nextInt(); //24973.

        //2. Realizar calculos.
        // Cuantos segundos hay en una hora = 3600.
        // CUantos minutos hay en una hora = 60.
        //Cuantos segundos hay en una minuto = 60.
        int horas = segundosTotal/3600;
        int minutos = (segundosTotal%3600)/60;
        int segundos = segundosTotal%60;
        //3. Mostrar datos.
        System.out.println("El numero de horas es " +horas);
        System.out.println("El numero de minutos es " +minutos);
        System.out.println("El numero de segundos es "+ segundos);

        lecturaTeclado.close();
        lecturaTeclado = null;

    }
}
