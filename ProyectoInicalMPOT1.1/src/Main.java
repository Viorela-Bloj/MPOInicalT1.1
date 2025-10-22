public class Main {
    public static void main(String[] args) {
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a realizar llamadas a metodos");
        saludar("Vio");
        saludar("Borja");
        saludar("Ana");
        despedir();
        //Operaciones.sumar(4,4); esta es una operación peligros, poniendo el static en la carpera de operaciones donde la suma
        Operaciones opercionesMatematicas = new Operaciones();
        opercionesMatematicas.sumar(1,4);
        opercionesMatematicas.resta(8,2);
        opercionesMatematicas.resta(8,5);
        opercionesMatematicas.sumar(10,50);
        System.out.println(opercionesMatematicas.multiplicar(7,3)*4);
        System.out.println("EL numero que se intenta validad tiene como resultado; "+opercionesMatematicas.validarNumero(28));
    }

        public static void saludar(String nombre){
            System.out.println("Hola " +nombre);
            System.out.println("Encantado de saludarte, vamos a practicar");
            System.out.println("Vamos a practicar el llamado de metodos");
            System.out.println("Animo, mo decaigas en tu tarea");

        }

        public static void despedir(){
        System.out.println("A cerrar el portatil, a pasar la tarde a casa");
        }





}
