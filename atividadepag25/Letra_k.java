/*Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em
real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível
com o usuário, para que seja apresentado o valor em moeda americana. */

void main(){
    
    float valorDolar = Float.parseFloat(IO.readln("Informe a cotação do dólar hoje:"));
    float quantidade = Float.parseFloat(IO.readln("Informe a quantidade que tem em reais:"));

    IO.println("Então você tá com as ruins no bolso em:" + quantidade/valorDolar + "tá com nada em");
}
