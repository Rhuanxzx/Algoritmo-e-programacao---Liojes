/*Ler duas matrizes A e B do tipo vetor com 20 elementos. Construir uma matriz C, onde cada
elemento de C é a subtração do elemento correspondente de A com B. Apresentar a matriz C. */

void main () {
    var a = new int [20];
    var b = new int [20];
    var c = new int [20];

    IO.println("Vetor A: ");
    for (int cont=0;cont<20; cont++ ){
        a [cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        c [cont] = a [cont] - b [cont];
    }

    IO.println("Vetor B: ");
    for (int cont=0;cont<20; cont++ ){
        b [cont] = Integer.parseInt(IO.readln("B[" + cont + "]: "));
    }

    for (int cont=0;cont<20; cont++ ){
        c [cont] = a [cont] - b [cont];
    }

    IO.println("Vetor c: ");
     for (int cont=0;cont<20; cont++ ){
     IO.readln("C [" + (cont) + "]: " + c[cont]);
      
     }

}