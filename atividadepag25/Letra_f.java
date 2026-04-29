/*Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de
forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da
variável A. Apresentar os valores trocados */

void main() {
 String A = IO.readln("Digite um número para A:");
 String B = IO.readln("Digite um número para B:");

 String C = A;
 A = B;
 B = C;
 IO.println(A + "-" + B);

}