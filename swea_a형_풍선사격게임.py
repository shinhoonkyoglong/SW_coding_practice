def solution(num, ar, v):
    global M
    if num == N:
        M = max(M, v)
        return
    for i in range(len(ar)):
        if len(ar) == 1:
            solution(num + 1, [], v + ar[0])
        elif i == 0:
            solution(num + 1, ar[1:], v + ar[1])
        elif i == len(ar) - 1:
            solution(num + 1, ar[:-1], v + ar[-2])
        else:
            solution(num + 1, ar[:i] + ar[i+1:], v + ar[i-1] * ar[i+1])
T = int(input())
for tc in range(1, T + 1):
    N = int(input())
    M = 0
    arr = list(map(int, input().split()))
    solution(0,arr,0)
    print(f"#{tc} {M}")