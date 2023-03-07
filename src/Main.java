public class Main {

    public static void write(int [] tab) {
        for (int i = 0; i < tab.length; i++) {

            System.out.print(tab[i] + " || ");
        }
        System.out.println();
    }

    public  static void bulles(int [] tab) {
        int i,j,val;
        for (i= tab.length -1; i>= 1; i--){
            for ( j = 1; j < i; j++) {
                if (tab[j-1] > tab[j]) {
                    //permutation
                    val = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = val;
                }
            }
        }
        //permet l'affichage avec la fonction write
        write(tab);
    }
    public static void main(String[] args) {

        int [] tab = {10,54,-6,15,9,0,3,2,741};

        bulles(tab);
    }
}