def dfs(num, cur, arr):
    global ans
    if num == 3:
        return
    for k in range(4):
        one = False
        way = dic[k]
        X = cur[0] + way[0]
        Y = cur[1] + way[1]
        while 0<=X<N and 0<=Y<N:
            if one:
                if arr[X][Y]:
                    if (X, Y) in ball:
                        ans += 1
                        ball.remove((X,Y))
                    arr[X][Y] = 0
                    dfs(num + 1, (X, Y), arr)
                    arr[X][Y] = 1
                    break
                else:
                    dfs(num + 1, (X, Y), arr)
            else:
                if arr[X][Y]:
                    one = True
            X += way[0]
            Y += way[1]

T = int(input())
for tc in range(1, T+1):
    dic = [(-1,0), (0,1), (1,0), (0,-1)]
    N = int(input())
    ans = 0
    ball = []
    arr = [list(map(int, list(input().split())))for _ in range(N)]
    for i in range(N):
        for j in range(N):
            if arr[i][j] == 1:
                ball.append((i,j))
            elif arr[i][j] == 2:
                start = (i,j)

    arr[start[0]][start[1]] = 0
    dfs(0, start, arr)
    print(f"#{tc} {ans}")