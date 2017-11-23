package nova.samplerecyclerview;

/**
 * Created by Administrator on 2017-11-23.
 */

public class ShoppingList {
    public String date;
    public String cal;
    public String sugar;
    public String salt;

    public ShoppingList(){
        date = "2016 9 27";
        cal = "13244Kcal";
        sugar = "45g";
        salt= "48g";
    }

    public ShoppingList(int id){
        date = "num = "+String.valueOf(id);
        cal = "13244Kcal";
        sugar = "45g";
        salt= "48g";
    }
}