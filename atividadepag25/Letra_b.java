//Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de
//conversão é C ← (F - 32) * (5/9) , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
void     main    (){
    float f = Float.parseFloat(IO.readln("Digite a temperatura em Fahrenheit"));
    float c = (f - 32) * ( (float) 5/9);
    IO.println("A temperatura em Celsius é:" + c);
}