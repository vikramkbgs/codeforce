#include<stdio.h>
#include<math.h>

int rev(int input1)
{
    int num = 0;
    while(input1 > 0)
    {
        num = num*10 + input1%10;
    }
    return num;
}

void main()
{
    int input1 = 1234;
    printf("rev : %d\n",rev(input1));
    printf("%d",(input1 - rev(input1)));
}