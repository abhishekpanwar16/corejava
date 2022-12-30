public class BarkingDog {
    public static boolean shouldWakeUp(boolean dogBarking, int hourOfDay){
        if(dogBarking == true && hourOfDay==0){
            return true;
        }
        else if(hourOfDay < 1){
            return false;
        }else if(((hourOfDay >=1 && hourOfDay < 8) || (hourOfDay >22 && hourOfDay <=24)) && dogBarking == true){
            return true;
        }else if(dogBarking == false){
            return false;
        }else{
            return false;
        }
    }
}
