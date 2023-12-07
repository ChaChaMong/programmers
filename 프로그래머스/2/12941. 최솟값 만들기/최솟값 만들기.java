import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        
        Arrays.sort(B);
//         B = Arrays.stream(B)
//             .boxed().sorted(Collections.reverseOrder())
//             .mapToInt(Integer::intValue).toArray();
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }
        
        return answer;
    }
}