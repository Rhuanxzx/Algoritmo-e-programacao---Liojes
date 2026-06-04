/*Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser
considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que
neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^). */

void main(){
    int potencia = 1;
    for (int expoente = 0; expoente <= 15; expoente++){
        if (expoente == 0){
            System.out.printf("3 elevado a %d é: %d \n", expoente, potencia);
        } else {
            potencia = potencia * 3;
            System.out.printf("3 elevado a %d é: %d \n", expoente, potencia);
        }
    }
}