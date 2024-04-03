class Solution {
    public int solution(int[] numbers, int target) {
        return new NumberOfCases(numbers, target).calc();
    }
}

class NumberOfCases {
    private final int[] numbers;
    private final int target;
    
    public NumberOfCases(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
    }
    
    int calc() {
        return calc(0, 0, "");
    }
    
    private int calc(int depth, int sum, String history) {
        if (depth == numbers.length) {            
            return sum == target ? 1 : 0;
        }
        
        return calc(depth + 1, sum + numbers[depth], history + "+" + numbers[depth])
            + calc(depth + 1, sum - numbers[depth], history + "-" + numbers[depth]);
    }
}