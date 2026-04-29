/*Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um
valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se
de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1. */

void main (){
    int n = Integer.parseInt(IO.readln("Informe o numero:"));
    int modulo = n;
    if (n<0)
        modulo = n * -1;
        IO.println("|" + n + "|=" + modulo);

}