package Searching;

public class LinearSearch2 {
    public static int searchDish(String menu[] , String dish){
        for (int i=0 ; i<menu.length ; i++){
            if(menu[i] == dish){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Find a dish iin a menue.
        String menu[] = {"Dosa" , "Idli" , "Upma" , "Uttapam" , "Medu Vada"};
        String dish = "Uttapam";
        int ans = searchDish(menu , dish);
        if(ans==-1){
            System.out.println("Dish not found");
        }else {
            System.out.println("Dish is present at index : "+ans);
        }
    }
}

