import java.time.LocalDate;

public class plusfourteenDays {
    public static void main(String[] args) {

            LocalDate todayDate= LocalDate.now();

        LocalDate plusfourteenDays=todayDate.plusDays(14);

        System.out.println(plusfourteenDays);
        
    }

}
