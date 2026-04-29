/*Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final o
quadrado da soma dos três valores lidos. */

void main(){
    int n1 = Integer.parseInt(IO.readln("n1:"));
    int n2 = Integer.parseInt(IO.readln("n2:"));
    int n3 = Integer.parseInt(IO.readln("n3:"));

    IO.println("resultado do quadrado da soma dos três valores." + Math.pow((n1 + n2 + n3),2));

}