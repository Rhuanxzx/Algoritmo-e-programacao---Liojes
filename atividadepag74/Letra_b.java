/*Ler 8 elementos em uma matriz A tipo vetor. Construir uma matriz B de mesma dimensão com os
elementos da matriz A multiplicados por 3. O elemento B[i] deverá ser implicado pelo elemento
A[i]*3, o elemento B[2] implicado pelo elemento A[2]*3 e assim por diante, até 8. Apresentar o vetor
B. */

void main(){
    var a = new int [10];
    var b = new int [10];

    IO.println("Vetor A: ");
    for (int cont=0;cont<10; cont++ ){
        a [cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        b [cont] = a [cont] * 3;
    }
    IO.println("Vetor B: ");
     for (int cont=0;cont<10; cont++ ){
     IO.readln("B [" + (cont) + "]: " + b[cont]);
     }
}