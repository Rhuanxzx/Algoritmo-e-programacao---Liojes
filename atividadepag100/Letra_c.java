/*/*Ler 20 elementos para uma matriz qualquer,
considerando 4 linhas e 5 colunas,
em seguida apresentar a matriz. */ 
void main (){

    var a = new int[4][5];

    IO.println("Informe os números de A:");

    // Leitura
    for (int lin = 0; lin < 4; lin++)
    {
        for (int col = 0; col < 5; col++)
        {
            a[lin][col] = Integer.parseInt(
                IO.readln("Digite A[" + (lin+1) + "][" + (col+1) + "]: ")
            );
        }
    }

    IO.println("Matriz:");

    // Impressão
    for (int lin = 0; lin < 4; lin++)
    {
        for (int col = 0; col < 5; col++)
        {
            System.out.printf("%5d", a[lin][col]);
        }

        IO.println();
    }
}