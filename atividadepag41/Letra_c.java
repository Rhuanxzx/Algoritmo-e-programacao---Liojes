/*Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não
foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o
valor da média do aluno para qualquer condição. */

void main(){
    double nota1 = Double.parseDouble(IO.readln("Insira a primeira nota"));
    double nota2 = Double.parseDouble(IO.readln("Insira a segunda nota"));
    double nota3 = Double.parseDouble(IO.readln("Insira a terceira nota"));
    double nota4 = Double.parseDouble(IO.readln("Insira a quarta nota"));
    double media = ((nota1 + nota2 + nota3 + nota4 )/4);

    if (media > 5)
      System.out.printf("O aluno está aprovado com média: %.2f" , media);
    else 
      System.out.printf("O aluno está aprovado com média:%.2f" , media);
}

    