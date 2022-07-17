public class Adder {
    public static void main(String[] args){
        int sum=0;
        for(String str: args){
            int x=Integer.parseInt(str);
            sum+=x;
        }
        System.out.println(sum);
    }
}
