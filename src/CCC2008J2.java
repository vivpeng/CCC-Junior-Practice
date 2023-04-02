import java.util.ArrayList;
import java.util.Scanner;

public class CCC2008J2 {
    public static void main(String[] args){
        //CCC '08 J2 - Do the Shuffle
        ArrayList<Character> songs = new ArrayList<Character>();
        songs.add('A');
        songs.add('B');
        songs.add('C');
        songs.add('D');
        songs.add('E');

        Scanner scanner = new Scanner(System.in);

        int button = 0, presses = 0;

        while (button != 4){
            button = scanner.nextInt();
            presses = scanner.nextInt();

            if (button == 4 && presses == 1)
                break;

            else if(button == 1){
                for(int i = 0; i < presses; i++){
                    char temp = songs.get(0);
                    songs.remove(0);
                    songs.add(temp);
                }
            }
            else if(button == 2){
                for(int i = 0; i < presses; i++){
                    for(int j = 0; j < songs.size(); j++) {
                        char temp = songs.get(j);
                        songs.set(j, songs.get(4));
                        songs.set(4, temp);
                    }
                }
            }
            else {
                for(int i = 0; i < presses; i++){
                    char temp = songs.get(0);
                    songs.set(0, songs.get(1));
                    songs.set(1, temp);
                }
            }
        }
        for(int i = 0; i < 5; i++)
            System.out.print(songs.get(i) + " ");
    }
}
