/*Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à
soma dos quadrados dos três valores lidos. */

void main(){
    int n1 = Integer.parseInt(IO.readln("informe o primeiro valor:"));
    int n2 = Integer.parseInt(IO.readln("informe o segundo valor:"));
    int n3 = Integer.parseInt(IO.readln("informe o terceiro valor:"));

    IO.println("resultado final da soma dos quadrados dos três valores lidos:" + (n1*n1 + n2*n2 + n3*n3));
    
}