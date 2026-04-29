//Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
//Volume = π * Raio² * Altura

void main() {
    
    float raio = Float.parseFloat(IO.readln("Digite o raio da lata de óleo:"));
    float altura = Float.parseFloat(IO.readln("Digite a altura"));
    double volume = 3.14 * (Math.pow(raio,2)) * altura;
    IO.println("O volume da lata é em cm3: " + volume);
    
}