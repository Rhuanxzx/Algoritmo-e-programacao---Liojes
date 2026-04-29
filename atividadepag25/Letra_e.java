/*Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula
PRESTACAO ← VALOR + (VALOR * TAXA/100) * TEMPO). */

void main (){
    Float valorPrestacao = Float.parseFloat(IO.readln("Digite o valor da prestacao:"));
    Float taxa = Float.parseFloat(IO.readln("Digite o taxa (a.m):"));
    int tempo = Integer.parseInt(IO.readln("Digite o tempo:"));

    float prestacao = (valorPrestacao + (valorPrestacao * taxa/100) * tempo);
    IO.println("O valor da sua prestação é:" + prestacao);



}
