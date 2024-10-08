//DO NOT EDIT THIS FILE

public class StapleTester {

    public static void main(String[] args) {
        //Code to test your stapler.  Do not edit.
        Stapler redStapler = new Stapler(), blueStapler = new Stapler(), whiteStapler = new Stapler();System.out.println(redStapler.getStaples() == 0 ? "\033[38;2;0;255;0m:)\033[0m New stapler is empty." : "\033[38;2;255;0;0m:(\033[0m New stapler should be empty.");System.out.println(redStapler.staple() == false ? "\033[38;2;0;255;0m:)\033[0m Empty stapler can't staple." : "\033[38;2;255;0;0m:(\033[0m Empty stapler shouldn't staple.");  redStapler.open();  redStapler.loadStaples(1);  System.out.println(redStapler.staple() == false ? "\033[38;2;0;255;0m:)\033[0m Open stapler can't staple." : "\033[38;2;255;0;0m:(\033[0m Open stapler shouldn't staple.");  redStapler.close();  redStapler.open();  redStapler.loadStaples(-50);    redStapler.close();  System.out.println(redStapler.getStaples() == 1 ? "\033[38;2;0;255;0m:)\033[0m loadStaples() ignores negative staples." : "\033[38;2;255;0;0m:(\033[0m loadStaples() should ignore negative staples.");  blueStapler.open();  blueStapler.loadStaples(525);  blueStapler.close();  whiteStapler.open();  whiteStapler.loadStaples(251);  whiteStapler.loadStaples(251);  whiteStapler.close();  System.out.println(blueStapler.getStaples() == 500 && whiteStapler.getStaples() == 500 ? "\033[38;2;0;255;0m:)\033[0m Stapler honors 500 staple capacity." : "\033[38;2;255;0;0m:(\033[0m Stapler may hold no more than 500 staples");  while(blueStapler.staple());  blueStapler.open();  blueStapler.loadStaples(1);  blueStapler.close(); boolean then, now; then = blueStapler.staple(); now = blueStapler.staple(); System.out.println(then == true && now == false && blueStapler.getStaples() == 0 ? "\033[38;2;0;255;0m:)\033[0m Staplers with staples return true.  Empty ones return false." : "\033[38;2;255;0;0m:(\033[0m Staplers with staples return true.  Empty ones return false.");        
        System.out.println("Thanks for using the Stapler tester \033[38;2;0;255;0m:)\033[0m");
    }
}

