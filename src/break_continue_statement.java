//the break exits a loop at once. Once a break statement is executed, the loop will not run again.
// However, after executing the continue statement, the following lines of code will be skipped for the current iteration only.
// The loop will begin to execute again.
public class break_continue_statement {
    public static void main(String[] args) {
        System.out.println("Test Continue statement in While loop");
        int i = 0;
        while (i < 5) {
            if (i == 2) {
                i++;
                continue;
            }
            System.out.println(i++);
        }
        System.out.println("Test Break statement in While loop");
        int j=0;
        while(j<5){
            if(j==2){
                break;
            }
            System.out.println(j++);
        }
    }
}
