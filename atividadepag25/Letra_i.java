/*Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo
segundo. */

void main(){
    int n1 = Integer.parseInt(IO.readln("n1:"));
    int n2 = Integer.parseInt(IO.readln("n2:"));



    IO.println("resultado do quadrado da diferença do primeiro valor pelo segundo." + Math.pow((n1 - n2),2));

}