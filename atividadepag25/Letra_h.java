/*Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula
VOLUME ← COMPRIMENTO * LARGURA * ALTURA. */

void    main(){

    IO.println("Informe os dado em centímetros");
    float comprimento = Float.parseFloat(IO.readln("Digite o comprimento:"));
    float largura = Float.parseFloat(IO.readln("Digite o largura:"));
    float altura = Float.parseFloat(IO.readln("Digite o altura:"));

    float volume = comprimento * largura * altura;
    IO.println("O volume da caixa retangular é:" + volume);
}