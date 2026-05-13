/*Ler 10 elementos de uma matriz tipo vetor e apresentá-los. */

void main (){
    var num = new int [10];
    for (int cont = 0;cont < 10; cont ++)
        num [cont] = Integer.parseInt(IO.readln("Digite o " + cont+1 + "° numero:"));
    IO.readln("Esses foram os números digitados: ");
      for (int cont = 0;cont < 10; cont ++)
        IO.println("Posição " + (cont) + " numero: " + num[cont] );
}