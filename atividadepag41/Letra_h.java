/*Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores. */

void main(){
    int  n1 = Integer.parseInt(IO.readln("Informe o primeiro número"));
    int maior = n1;
    int menor = n1;
    int  n2 = Integer.parseInt(IO.readln("Informe o segundo número"));
    if (n2>maior)
        maior = n2;
    if (n2<menor)
        menor = n2;

    int  n3 = Integer.parseInt(IO.readln("Informe o terceiro número"));
    if (n3>maior)
        maior = n3;
    if (n3<menor)
        menor = n3;
    int  n4 = Integer.parseInt(IO.readln("Informe o quarto número"));
    if (n4>maior)
        maior = n4;
    if (n4<menor)
        menor = n4;
    int  n5 = Integer.parseInt(IO.readln("Informe o quinto número"));
    if (n5>maior)
        maior = n5;
    if (n5<menor)
        menor = n5;

    IO.println("O maior número lido foi:" + maior);
    IO.println("O menor número lido foi:" + menor);



}