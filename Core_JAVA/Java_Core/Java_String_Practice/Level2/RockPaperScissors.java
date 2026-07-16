import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWins=0, compWins=0;
        for(int i=0;i<games;i++) {
            String user = sc.next();
            String comp = computerChoice();
            int res = winner(user,comp);
            if(res>0) userWins++;
            if(res<0) compWins++;
            System.out.println(user+" vs "+comp+" -> "+(res==0?"Draw":(res>0?"User":"Computer")));
        }
        double uw = games==0?0:(userWins*100.0/games);
        double cw = games==0?0:(compWins*100.0/games);
        System.out.println("UserWins " + userWins + " CompWins " + compWins);
        System.out.println(String.format("User%% %.2f Comp%% %.2f",uw,cw));
        sc.close();
    }
    static String computerChoice() {
        int r = (int)(Math.random()*3);
        return r==0?"rock":r==1?"paper":"scissors";
    }
    static int winner(String u,String c) {
        if(u.equals(c)) return 0;
        if(u.equals("rock")&&c.equals("scissors")) return 1;
        if(u.equals("scissors")&&c.equals("paper")) return 1;
        if(u.equals("paper")&&c.equals("rock")) return 1;
        return -1;
    }
}
