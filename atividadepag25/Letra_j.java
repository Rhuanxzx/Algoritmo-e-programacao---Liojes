/*Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em
dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares
disponível com o usuário, para que seja apresentado o valor em moeda brasileira. */

void main(){

    float valorDolar = Float.parseFloat(IO.readln("Informe a cotação do dólar hoje:"));
    float quantidade = Float.parseFloat(IO.readln("Informe a quantidade que tem em dólar:"));

    IO.println("Então você tá com as boas no bolso em:" + valorDolar*quantidade + "tá importante,olha quantos dolares");
}