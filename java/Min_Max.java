public class Min_Max {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = Integer.parseInt(args[i]) + sum;
            if (min > Integer.parseInt(args[i])) {
                min = Integer.parseInt(args[i]);
            }
            if (max < Integer.parseInt(args[i])) {
                max = Integer.parseInt(args[i]);
            }
        }
        System.out.println("Max is\n " + max + "\nmin is " + min + "\nsum is" + sum);
    }
}
