public class PallindromeTime {
    public static void main(String[] args) {
        System.out.println(solve("23:59"));
    }

    public static int solve(String A) {
        int hh = (A.charAt(0)-'0')*10 + (A.charAt(1)-'0');
        int mm = (A.charAt(3)-'0')*10 + (A.charAt(4)-'0');
        int ans = 0;
        while(hh/10 != mm%10 || hh%10 != mm/10){
            mm++;
            ans++;
            if(mm == 60){
                mm = 0;
                hh++;
            }
            if(hh == 24){
                hh = 0;
            }
        }
        return ans;
    }
}