class Solution {
    public int reverse(int x) {
        Scanner sc = new Scanner(System.in);
         int rev = 0;

    while (x != 0)
    {
        int digit = x % 10;
        int newResult = rev * 10 + digit;
        if ((newResult - digit) / 10 != rev)
        { return 0; }
        rev = newResult;
        x = x / 10;
    }

    return rev;
    }
}