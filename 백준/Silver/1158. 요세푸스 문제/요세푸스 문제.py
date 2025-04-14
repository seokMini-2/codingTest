from collections import deque
dq=deque()
ans=[]

N, K= map(int, input().split())

for i in range(N):
    dq.append(i+1)

while len(dq)>0:
    for i in range(K-1):
        dq.append(dq.popleft())
    ans.append(dq.popleft())

print("<"+", ".join(map(str, ans))+">")


