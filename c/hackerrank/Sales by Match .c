// https://www.hackerrank.com/challenges/sock-merchant/problem
int sockMerchant(int n, int ar_count, int* ar) {
    unsigned char colors[101] = {0};
    for(unsigned char i = 0; i < ar_count; colors[ar[i++]]++)
        ;
    unsigned char pairs = 0;
    for(unsigned char i = 1; i < 101; pairs += colors[i++] / 2)
        ;
    return pairs;
}
