
class Reverse {
    public int reverse(int x) {
        int ans = 0;

        while (x != 0) {
            int rem = x % 10;

            // ✅ Overflow check before multiplying and adding
            if (ans > Integer.MAX_VALUE / 10 || 
                (ans == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // Positive overflow
            }
            if (ans < Integer.MIN_VALUE / 10 || 
                (ans == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; // Negative overflow
            }

            ans = ans * 10 + rem;
            x = x / 10;
        }

        return ans;
    }
}
// Target -> Reverse Integer 