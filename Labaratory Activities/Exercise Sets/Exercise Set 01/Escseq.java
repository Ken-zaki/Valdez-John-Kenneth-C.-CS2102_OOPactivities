public class Escseq {
    public class ES {
        public static void main (String[] args ){
            int Multiple = 6;
            for (int i = 1; i < Multiple; i++){
               int x = i * 7;
                if (i % 2 == 0) {
                    System.out.println("\t" + x);
                } else {
                    System.out.println(x);
                }
            }
        }
    }
}
