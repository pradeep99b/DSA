
#include <stdio.h>
void swap(int *m, int * n){
    
    int temp = *m;
    *m = *n;
    *n = temp;
}
int main() {
    // Write C code here
   int arr[] = {44,33,55,22,11};
   for(int i =0 ; i<4; i++ ){
       
       for(int j=i+1; j<5; j++){
           
           if(*(arr + i) > *(arr + j)){
               swap((arr+i),(arr + j));
           }
           
       }
   }
   
   for(int i=0;i<5;i++)
        printf("%d ",*(arr + i));
        
  

    return 0;
}