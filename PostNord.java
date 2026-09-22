public class PostNord {
     public static double beraknaFrakt(double varuvardet, double procent, double fastAvgift){
        return varuvardet * procent + fastAvgift;
    }
  public static void main(String[] args) {
        double order101 = beraknaFrakt(120.0, 0.15, 29.0);
        double order102 = beraknaFrakt(85.0, 0.15, 29.0);
        double order103 = beraknaFrakt(200.0, 0.15, 29.0);
        System.out.println("Fraktkostnad för order 101: " + order101);
        System.out.println("Fraktkostnad för order 102: " + order102);
        System.out.println("Fraktkostnad för order 103: " + order103);
  }
   
}
    