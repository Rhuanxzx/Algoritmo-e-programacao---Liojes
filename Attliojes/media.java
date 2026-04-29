void main(){
    float nota1 = Float.parseFloat(IO.readln("Informe a primeira nota: "));
    float nota2 = Float.parseFloat(IO.readln("Informe a segunda nota: "));
    float nota3 = Float.parseFloat(IO.readln("Informe a terceira nota: "));

    float media = (nota1 + nota2 + nota3) / 3;

    if (media >= 7) {
        IO.println("Aprovado com média " + media);
    } else {
        IO.println("Reprovado com média " + media);
    }
}