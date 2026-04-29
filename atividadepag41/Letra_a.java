/*Ler dois valores numéricos inteiros e apresentar o resultado
 da diferença do maior pelo menor valor. */

void main () {
    int n1 = Integer.parseInt(IO.readln("Digite o primeiro valor:"));
    int n2 = Integer.parseInt(IO.readln("Digite o segundo valor:"));

    if (n1 > n2)
       IO.println(n1 + " - " + n2 + "=" + ( n1 - n2) ); 
    else
        IO.println(n2 + " - " + n1 + "=" + ( n2 - n1) );

}