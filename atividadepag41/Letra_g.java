/*Efetuar a leitura de quatro números inteiros 
e apresentar os números que são divisíveis por 2 e 3. */

void main () {
    int n1 = Integer.parseInt(IO.readln("Informe n1:"));
    int n2 = Integer.parseInt(IO.readln("Informe n2:"));
    int n3 = Integer.parseInt(IO.readln("Informe n3:"));
    int n4 = Integer.parseInt(IO.readln("Informe n4:"));

    if( (n1%2==0) && (n1%3==0) );
     IO.println(n1 + "É divisivel por 2 e por 3");

    if( (n2%2==0) && (n2%3==0) );
     IO.println(n2 + "É divisivel por 2 e por 3");

    if( (n3%2==0) && (n3%3==0) );
     IO.println(n3 + "É divisivel por 2 e por 3");

    if( (n4%2==0) && (n4%3==0) );
     IO.println(n4 + "É divisivel por 2 e por 3");
    


}