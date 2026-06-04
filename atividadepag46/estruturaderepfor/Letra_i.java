/*Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
somatório e a média aritmética dos valores lidos. */

void main(){
    int valor, soma=0;
    for(int contador=1; contador<=10; contador++){
        valor = Integer.parseInt(IO.readln("Informe um valor: "));
        soma = soma + valor;
    }
    double media = soma/10;
    IO.println("Soma dos valores digitados: " + soma);
    IO.println("Média dos valores digitados: " + media);
}