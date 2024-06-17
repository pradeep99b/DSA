#include <stdio.h>

int main() {
    int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
    int k = 3;
    int n = sizeof(arr) / sizeof(arr[0]);

    int neg = 0;

    // Create a queue to store indices of negative numbers
    int queue[n];
    int front = 0, rear = 0;

    // Process the first window separately
    for (int i = 0; i < k; i++) {
        if (arr[i] < 0) {
            queue[rear++] = i;
        }
    }

    // Process the remaining windows
    for (int i = k; i < n; i++) {
        // Print the first negative number of the previous window
        if (front < rear) {
            printf("%d ", arr[queue[front]]);
        } else {
            printf("0 ");
        }

        // Remove elements that are out of this window
        while (front < rear && queue[front] <= i - k) {
            front++;
        }

        // Add the current element to the queue if it is negative
        if (arr[i] < 0) {
            queue[rear++] = i;
        }
    }

    // Print the first negative number for the last window
    if (front < rear) {
        printf("%d ", arr[queue[front]]);
    } else {
        printf("0 ");
    }

    return 0;
}
