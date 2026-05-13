/*Ler duas matrizes A e B do tipo vetor com 15 elementos cada. Construir uma matriz C, sendo esta a
junção das duas outras matrizes. Desta forma, C deverá ter o dobro de elementos, ou seja, 30.
Apresentar a matriz C. */


void main () {
    var a = new int [15];
    var b = new int [15];
    var c = new int [30];

    IO.println("Vetor A: ");
    for (int cont=0;cont<15; cont++ ){
        a [cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        
    }

    IO.println("Vetor B: ");
    for (int cont=0;cont<15; cont++ ){
        b [cont] = Integer.parseInt(IO.readln("B[" + cont + "]: "));
    }

    for (int cont=0;cont<15; cont++ ){
        c [cont] = a [cont];}

    for (int cont=0;cont<15; cont++ ){
        c [cont+15] = b [cont];}

    IO.println("Vetor c: ");
     for (int cont=0;cont<30; cont++ ){
     IO.readln("C [" + (cont) + "]: " + c[cont]);
      
     }

}