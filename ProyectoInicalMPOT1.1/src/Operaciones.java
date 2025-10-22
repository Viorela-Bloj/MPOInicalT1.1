public class Operaciones {
    //Tiene variables, y metodos que puedes ejecutar.
    public  void sumar(int op1, int op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suma es " +resultado);
    }
    public void resta(int op1, int op2){
        int resultado =op1-op2;
        System.out.println("El resiltado de la suma es "+ resultado);
    }
    public int multiplicar(int op1,int op2){
        int resultado = op1*op2;
        System.out.println("El metodo esta listo para retornar");
        return resultado;
    }
    public boolean validarNumero(int numeroValidar){
        return numeroValidar>0;
    }

}
