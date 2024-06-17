#include<stdio.h>
#include<math.h>

void isPrime(int *arr, int m) {
    // Initialize all elements as prime (1)
    for (int i = 2; i < m; i++) {
        arr[i] = 1;
    }

    // 0 and 1 are not prime numbers
    arr[0] = 0;
    arr[1] = 0;

    for (int i = 2; i <= sqrt(m); i++) {
        if (arr[i]) { // If arr[i] is still prime
            for (int j = i * i; j < m; j += i) {
                arr[j] = 0; // Mark multiples of i as non-prime
            }
        }
    }
}

int main() {
    int arr[101];
    isPrime(arr, 101);

    printf("The prime numbers between 1 to 100 are:\n");
    for (int i = 1; i < 101; i++) {
        if (arr[i] == 1)
            printf("%d ", i);
    }

    return 0;
}
