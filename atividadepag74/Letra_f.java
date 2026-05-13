/*Ler duas matrizes do tipo vetor, sendo A com 20 elementos e B com 30 elementos. Construir uma
matriz C, sendo esta a junção das duas outras matrizes. Desta forma, C deverá ter a capacidade de
armazenar 50 elementos. Apresentar a matriz C. */

void main () {
    var a = new int [20];
    var b = new int [30];
    var c = new int [50];

    IO.println("Vetor A: ");
    for (int cont=0;cont<20; cont++ ){
        a [cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        
    }

    IO.println("Vetor B: ");
    for (int cont=0;cont<30; cont++ ){
        b [cont] = Integer.parseInt(IO.readln("B[" + cont + "]: "));
    }

    for (int cont=0;cont<20; cont++ ){
        c [cont] = a [cont];}

    for (int cont=0;cont<30; cont++ ){
        c [cont+20] = b [cont];}

    IO.println("Vetor c: ");
     for (int cont=0;cont<50; cont++ ){
     IO.readln("C [" + (cont) + "]: " + c[cont]);
      
     }

}