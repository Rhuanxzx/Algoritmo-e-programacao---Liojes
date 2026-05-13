/*Ler duas matrizes A e B, cada uma com uma dimensão para 7 elementos. 
Construir uma matriz C de duas dimensões, em que a primeira coluna deverá ser formada pelos 
elementos da matriz A e a segunda coluna deverá ser formada pelos elementos da matriz B.
Apresentar a matriz C. */

void main (){
    var a = new int [7];
    var b = new int [7];
    var c = new int [7][2];

    IO.println("Informe os números de A:");
    for (int lin=0; lin<7;lin++){
         a [lin] = Integer.parseInt(IO.readln("Digite A[" + (lin+1) + "]: " ));
    }
     IO.println("Informe os números de B:");
    for (int lin=0; lin<7;lin++){
         b [lin] = Integer.parseInt(IO.readln("Digite B[" + (lin+1) + "]: " ));
    }
     
    for (int lin=0; lin<7;lin++){
        for(int col=0;col<2;col++){
            c[lin][0] = a[lin];
            c[lin][1] = b[lin];
            System.out.printf("%5d", c[lin][col]);
        }
        IO.println();
    }

    
}