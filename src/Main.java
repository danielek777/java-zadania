class Main {
    void main() {
        double liczba = 6;
        double liczba2 = 9;
        double wynik = (liczba + liczba2);
        System.out.println(wynik);

        if (wynik == 15) {
            System.out.println("TRUE");}
                    else{
            System.out.println("FALSE");
        }

        String cos = "hyefbhsbcsefhkifuwliw";
        String zmienna = " wartość zmiennej ";
        String inna = " inny tekst ";
        String text = "Połączenie zmiennych " + cos + zmienna + inna;
        System.out.println(text);

        /*
        for(wyrażenie początkowe; wyrażenie warunkowe; wyrażenie modyfikujące) {
         instrukcje do wykonania }
*/
        for (int i =10; i>-5; i--) {
            System.out.println("Przebieg" + i);
        }
            int k =0;
            while (k<2) {
                System.out.println("Punch");
                k++;
            }
       // String[] liczby = {"pierwszy" , "drugi", "trzeci", "czwarty"};
        //int z;
       // for (liczby[z]; liczby[z+1] ; z++ );

    
    }
}