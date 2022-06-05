#include<stdio.h>

void main()
{
    int input1[4] = {12,28,15,14};
    int input2 = 4;


    int sum = 0;
    for(int i = 0; i<input2; i++)
        sum +=  input1[i];

    int tempSum = sum;
    for(int i = 2; i<= tempSum/2; i++)
        {
            if(tempSum%i == 0)
                {
                    tempSum++;
                    i = 2;
                }
        }
    int numAppend = tempSum - sum;
    // return numAppend;
}