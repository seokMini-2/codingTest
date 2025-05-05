N=int(input())
arrN=list(map(int,input().split()))
M=int(input())
arrM=list(map(int,input().split()))

def bin(arr,key, low, high):
    if low>high:
        return print(0)
    mid=(low+high)//2
    if arr[mid]==key:
        return print(1)
    elif arr[mid]<key:
        low=mid+1
        return bin(arr,key,low,high)
    else:
        high=mid-1
        return bin(arr,key,low,high)
arrN.sort()
for i in arrM:
    bin(arrN,i,0,len(arrN)-1)
