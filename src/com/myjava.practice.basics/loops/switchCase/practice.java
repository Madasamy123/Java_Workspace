public class practice {

    public void print(char buildingIdentifier){

        switch (buildingIdentifier) {
            case 'A':
            case 'M':
            case 'L':
                System.out.println("10 Floor");
                break;
            
            case 'B':
            case 'V':
            case 'J':
                System.out.println("14 Floor");
                break;

            case 'C':
            case 'F':
            case 'G':
                System.out.println("20 Floor");
                break;

            case 'D':
            case 'H':
            case 'I':
                System.out.println("30 Floor");
                break;
            case 'E':
            case 'K':
            case 'N':

                System.out.println("35 Floor");
                break;
            default:
                System.out.println("50 Floor");
            
        }
    }

    public static void main(String[] args) {
        practice prac=new practice();
        prac.print('A');
        prac.print('L');
    }

    
}
