public class Breakfast{
    private Breakfast(){}
    public static void eat(Korotishka ... korotishkaArray){
        for(Korotishka korotishka : korotishkaArray){
            if(korotishka.getPlace() != Place.FLOWERTOWN){
                System.out.println(korotishka.getName() + " не пришел на завтрак");
            }
        }
    }
}
