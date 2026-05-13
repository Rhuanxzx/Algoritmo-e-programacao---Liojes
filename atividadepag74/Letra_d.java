
void main(){
    var a = new int [15];
    var b = new int [15];

    IO.println("Vetor A: ");
    for (int cont=0;cont<15; cont++ ){
        a [cont] = Integer.parseInt(IO.readln("A[" + cont + "]: "));
        b [cont] =  a [cont] *  a [cont] ;
    }
    
    IO.println("Vetor B: ");
     for (int cont=0;cont<15; cont++ ){
     IO.readln("B [" + (cont) + "]: " + b[cont]);
     }
    }