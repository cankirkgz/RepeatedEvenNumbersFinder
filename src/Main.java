public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 2, 4, 12, 4, 6, 5, 51, 14, 14, 16, 18, 20};

        int[] frequency = new int[numbers.length];
        boolean[] isRepeated = new boolean[numbers.length];

        // Calculate the frequencies of numbers and detect repeated even numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        frequency[i]++;
                        isRepeated[j] = true;
                    }
                }
            }
        }

        // Print the repeated even numbers along with their frequencies
        System.out.println("Repeated Even Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (frequency[i] > 0 && !isRepeated[i]) {
                System.out.println(numbers[i] + " (Frequency: " + (frequency[i] + 1) + ")");
            }
        }
    }
}
