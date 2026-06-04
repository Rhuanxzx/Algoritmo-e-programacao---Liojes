/*Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores
pares situados na faixa numérica de 50 a 70. */ 

void main (){
    int par=0, soma=0;
    for(int contador=50; contador<=70; contador=contador+10){
       
        if(contador % 2 ==0){
        soma = soma + contador;
        par++;
    
    }
    float media = soma/par;
    IO.println("Soma dos valores pares existentes entre 50 e 70: " + soma);
    IO.println("Média dos valores pares existentes entre 50 e 70: " + media);
}
       
}

    