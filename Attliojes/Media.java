void main () {
    float Nota1 = Float.parseFloat(IO.readln("Digite a primeira nota:"));
    float Nota2 = Float.parseFloat(IO.readln("Digite a segunda nota:"));
    float Nota3 = Float.parseFloat(IO.readln("Digite a terceira nota:"));

    float Media = (Nota1 + Nota2 + Nota3) / 3;
    IO.println("A média é: " + Media);

    if (Media >= 7) {
        IO.println("Aluno aprovado!");
    } else {
        IO.println("Aluno reprovado!");
    }


}