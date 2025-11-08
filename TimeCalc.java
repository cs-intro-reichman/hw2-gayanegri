public class TimeCalc {
    public static void main(String[] args) {
        String hoursString = args[0].substring(0, 2);
        int hours = Integer.parseInt(hoursString);
        String minutesString = args[0].substring(3, 5);
        int minutes = Integer.parseInt(minutesString);
        int addMinutes = Integer.parseInt(args[1]);
        int totalMinutes = ((hours * 60) + minutes + addMinutes);
        int totalHours = (totalMinutes/60);
        int newHours = (totalHours%24);
        int newMinutes = totalMinutes - (totalHours * 60);
        if (newHours < 10) {
            System.out.print("0" + newHours);// Replace this comment with your code
        } else {
            System.out.print(newHours);
        }
        if (newMinutes < 10) {
            System.out.println(":0" + newMinutes);
        } else {
            System.out.println(":" + newMinutes);
        }
    
    
}
}