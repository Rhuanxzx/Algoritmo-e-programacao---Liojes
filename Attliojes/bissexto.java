void main(){

    int ano = Integer.parseInt(IO.readln("Informe um ano: "));
    boolean bissexto = ( ano % 4==0 && ano %100 != 0) || (ano % 400 == 0);
    IO.println("O ano " + ano + " é bissexto");
}