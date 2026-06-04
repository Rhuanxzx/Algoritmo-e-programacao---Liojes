/*Elaborar um programa que apresente no final o somatório dos valores 
pares existentes na faixa de
1 até 500. */

void main(){
    int soma = 0;
    for (int contador =1; contador<=500; contador++)
    {
        if (contador % 2 == 0)
        {
            soma = soma + contador;
        }
    }
    System.out.printf("A soma dos números pares de 1 a 500 é: %d", soma);



}