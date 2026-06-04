/*Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer. */

void main (){
    int numero = Integer.parseInt(IO.readln("Digite um numero:"));
    for (int multiplicador = 1; multiplicador<=10; multiplicador++){
        System.out.printf("%d x %d = %d \n", numero, multiplicador, numero * multiplicador);
    }
}