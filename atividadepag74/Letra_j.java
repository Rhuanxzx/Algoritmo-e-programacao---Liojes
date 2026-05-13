/*Ler duas matrizes A e B de uma dimensão com 6 elementos. 
A matriz A deverá aceitar apenas a entrada de valores pares, 
enquanto a matriz B deverá aceitar apenas a entrada de valores ímpares.
A entrada das matrizes deverá ser validada pelo programa e não pelo usuário.
Construir uma matriz C de forma que a matriz C seja a junção das matrizes A e B, 
de modo que a matriz C contenha 12 elementos. Apresentar a matriz C. */
void main (){

    var a = new int[6];
    var b = new int[6];
    var c = new int[12];

    IO.println("Vetor A (somente números pares):");

    for (int cont = 0; cont < 6; cont++)
    {
        int numero = Integer.parseInt(
            IO.readln("A[" + cont + "]: ")
        );

        while (numero % 2 != 0)
        {
            IO.println("Valor inválido! Digite um número par.");

            numero = Integer.parseInt(
                IO.readln("A[" + cont + "]: ")
            );
        }

        a[cont] = numero;
    }

    IO.println("Vetor B (somente números ímpares):");

    for (int cont = 0; cont < 6; cont++)
    {
        int numero = Integer.parseInt(
            IO.readln("B[" + cont + "]: ")
        );

        while (numero % 2 == 0)
        {
            IO.println("Valor inválido! Digite um número ímpar.");

            numero = Integer.parseInt(
                IO.readln("B[" + cont + "]: ")
            );
        }

        b[cont] = numero;
    }

    for (int cont = 0; cont < 6; cont++)
    {
        c[cont] = a[cont];

        c[cont + 6] = b[cont];
    }

    IO.println("Vetor C:");

    for (int cont = 0; cont < 12; cont++)
    {
        IO.println("C[" + cont + "] = " + c[cont]);
    }
}