/*Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na
utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D,
devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim
C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de
multiplicação e apresentar doze resultados de saída. */

void main(){
    int A = Integer.parseInt(IO.readln("A:"));
    int B = Integer.parseInt(IO.readln("B:"));
    int C = Integer.parseInt(IO.readln("C:"));
    int D = Integer.parseInt(IO.readln("D:"));

    IO.println(" A + B = " + (A + B));
    IO.println(" A + C = " + (A + C));
    IO.println(" A + D = " + (A + D));
    IO.println(" B + C = " + (B + C));
    IO.println(" B + D = " + (B + D));
    IO.println(" C + D = " + (C + D));
    IO.println(" A x B = " + (A * B));
    IO.println(" A x C = " + (A * C));
    IO.println(" A x D = " + (A * D));
    IO.println(" B x C = " + (B * C));
    IO.println(" B x D = " + (B * D));
    IO.println(" C x D = " + (C * D));
    



 
}