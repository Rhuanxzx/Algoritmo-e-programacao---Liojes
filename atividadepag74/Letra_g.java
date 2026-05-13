/*Ler 20 elementos de uma matriz A tipo vetor e construir uma matriz B de mesma dimensão
 com os mesmo elementos da matriz A, sendo que deverão estar invertidos. 
 Ou seja, o primeiro elemento de A passa a ser o último de B, 
 o segundo elemento de A passa a ser o penúltimo elemento de B e
assim por diante. Apresentar as matrizes A e B lado a lado. */

void main ()
{
    var a = new int [20];
    var b = new int [20];

    IO.println("Vetor A: ");
    for (int cont=0;cont<20; cont++)
        {
        
        a [cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        b[19 - cont] = a[cont];
    }

    IO.println("Vetor B: ");
     for (int cont=0; cont<20; cont++){
     IO.readln("B[" + (cont) + "]: " + b [cont] );
     }
}     






