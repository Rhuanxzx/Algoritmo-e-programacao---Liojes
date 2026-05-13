/*Ler três matrizes (A, B e C) de uma dimensão com 5 elementos cada. Construir uma matriz D,
sendo esta a junção das três outras matrizes. Desta forma D deverá ter o triplo de elementos,
ou seja, 15. Apresentar os elementos da matriz D. */

void main (){
    var a = new int[5];
    var b = new int[5];
    var c = new int[5];
    var d = new int[15];

    
    IO.println("Vetor A: ");
    for (int cont=0;cont<5; cont++ ){
        a [cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        
    }

    IO.println("Vetor B: ");
    for (int cont=0;cont<5; cont++ ){
        b [cont] = Integer.parseInt(IO.readln("B[" + cont + "]: "));
    }

    IO.println("Vetor C: ");
    for (int cont=0;cont<5; cont++ ){
        c [cont] = Integer.parseInt(IO.readln("C[" + cont + "]: "));
    }

    for (int cont=0;cont<5; cont++ ){
        d [cont] = a [cont];}

    for (int cont=0;cont<5; cont++ ){
        d [cont+5] = b [cont];}

     for (int cont=0;cont<5; cont++ ){
        d [cont+10] = c [cont];}
    

    IO.println("Vetor D: ");
     for (int cont=0;cont<15; cont++ ){
     IO.readln("D [" + (cont) + "]: " + d[cont]);
      
     }

}