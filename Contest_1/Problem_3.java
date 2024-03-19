//3
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        Queue<Integer> st = new LinkedList<>();
        Stack<Integer> food = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.offer(students[i]);
        }
        for(int i=n-1; i>=0; i--){
            food.push(sandwiches[i]);
        }

        int count = 0;
        while (count < food.size()) {
            if (st.peek().equals(food.peek())) {
                st.poll();
                food.pop();
                count = 0;
            } else {
                int val = st.poll();
                st.offer(val);
                count++;
            }
        }

        return count;
    }
}