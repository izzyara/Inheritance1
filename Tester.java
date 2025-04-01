import java.util.*;
public class Tester {
    
    public static void main (String[]args){

        ArrayList<Clothes> listOfClothes = new ArrayList<Clothes>();
        Clothes c1 = new Clothes();
        Clothes c2 = new Outerwear();
        Clothes c3 = new CoolJacket();
        Clothes c4 = c3;
        Clothes c5 = new Clothes("sweater", "large");
        Clothes c6 = new Outerwear("medium", true);
        Clothes c7 = new CoolJacket("extra large", "puffer");
        Clothes c8 = new Clothes("t-shirt", "small");
        Clothes c9 = c8;
        Clothes c10 = new CoolJacket("large", "windbreaker");
        listOfClothes.add(c1);
        listOfClothes.add(c2);
        listOfClothes.add(c3);
        listOfClothes.add(c4);
        listOfClothes.add(c5);
        listOfClothes.add(c6);
        listOfClothes.add(c7);
        listOfClothes.add(c8);
        listOfClothes.add(c9);
        listOfClothes.add(c10);

        for (Clothes c : listOfClothes){
            System.out.println(c.toString());
        }


    }
}
