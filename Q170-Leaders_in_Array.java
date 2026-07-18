public class LeadersInArray {
    public static void main(String[] args) {
        int[] numbers = {16, 17, 4, 3, 5, 2};

        int leader = numbers[numbers.length - 1];
        System.out.print(leader + " ");

        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] > leader) {
                leader = numbers[i];
                System.out.print(leader + " ");
            }
        }
    }
}
