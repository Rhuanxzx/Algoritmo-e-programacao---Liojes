/*Ler duas matrizes A e B, cada uma de duas dimensões com 5 linhas e 3 colunas. Construir uma
matriz C de mesma dimensão, que é formada pela soma dos elementos da matriz A com os
elementos da matriz B. Apresentar a matriz C. */

void main(){
    var a = new int [5][3];
    var b = new int [5][3];
    var c = new int [5][3];

    IO.println("informe os números de A:");
    for (int lin=0; lin<5;lin++)
    {
      for (int col=0; col<3; col++){
      a [lin][col] = Integer.parseInt(IO.readln("Digite A[" + (lin+1) + "][" + (col+1) + "]: "));}
    }

    IO.println("informe os números de B:");
    for (int lin=0; lin<5;lin++)
    {
      for (int col=0; col<3; col++)
      {  b [lin][col] = Integer.parseInt(IO.readln("Digite B[" + (lin+1) + "][" + (col+1) + "]: "));}
    }

    
    for (int lin=0; lin<5;lin++)
    {
      for (int col=0; col<3; col++)
      {  c [lin][col] = a [lin][col] + b [lin][col];
       System.out.printf("%5d", c [lin][col]);
    }

    IO.println();
}
}