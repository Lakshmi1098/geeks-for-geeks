t=int(input())
for k in range(t):
    n=int(input())
    arr=list(map(int,input().split()))
    x=np.reshape(arr,(-1,n))
    y=np.transpose(x)
    for i in range(n):
        for j in range(n):
           print(y[i][j],end=" ")
    print()
