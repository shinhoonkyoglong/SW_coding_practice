T = int(input())
for tc in range(1, T + 1):
    N = int(input())
    arr = [tuple(map(int, input().split())) for _ in range(N)]
    target = 1
    L = []
    L.append((0,0,0))
    for i in range(N):
        for j in range(N):
            if arr[i][j] != 0:
                L.append((arr[i][j], i, j))
    L.sort()
    ans = 0
    cur = 0
    ru = [3, 3, 2, 1]
    rd = [1, 3, 3, 2]
    ld = [2, 1, 3, 3]
    lu = [3, 2, 1, 3]
    for i in range(len(L)-1):
        a, b = L[i][1], L[i][2]
        c, d = L[i+1][1], L[i+1][2]
        # 3사
        if a < c and b > d:
            ans += ld[cur]
            cur = (cur + ld[cur]) % 4
        # 1사
        elif a > c and b < d:
            ans += ru[cur]
            cur = (cur + ru[cur]) % 4
        # 2사
        elif a > c and b > d:
            ans += lu[cur]
            cur = (cur + lu[cur]) % 4
        # 4사
        else:
            ans += rd[cur]
            cur = (cur + rd[cur]) % 4
    print(f"#{tc} {ans}")