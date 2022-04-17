package com.company;


//PASO POR REFERENCIA

public class Referencia {

    public static void main(String[] args) {
        Potato miPotato = new Potato();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        //miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos);
    }
}
class Potato{
        public int brazos = 0;

        public  void QuitarBrazo(){
            this.brazos--;
        }

}

