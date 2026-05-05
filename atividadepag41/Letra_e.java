/*Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de
segundo grau, apresentando as duas raízes, se para os valores informados for possível efetuar o
referido cálculo. Lembre-se de que a variável A deve ser diferente de zero. */

void main () {
    double a = Double.parseDouble(IO.readln("a:"));
    double b = Double.parseDouble(IO.readln("b:"));
    double c = Double.parseDouble(IO.readln("c:"));

    if ( a != 0 ) {
        double delta = Math.pow(b,2) - 4 * a * c;
        if ( delta>=0) {
            double x1 = (-b + Math.sqrt(delta)/(2*a));
            double x2 = (-b - Math.sqrt(delta)/(2*a));
            System.out.printf("x' = %.2f e x'' = %.2f \n" , x1 , x2);
        }
        else 
           System.out.printf("Valor delta %.2f negativo. Não existem raízes reais \n" , delta);
        

    }
    else 
      IO.println("O termo a é obrigatório para a equação do 2° grau existir");
}