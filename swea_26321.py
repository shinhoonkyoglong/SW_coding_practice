T = int(input())
def solution(num, v, visited, front, able):
    global ans
    if v >= ans:
        return
    if num == h:
        ans = min(ans, v)
        return ans
    for k in range(h):
        if visited[k] == False:
            if L[k][-1] > 0:
                visited[k] = True
                able[L[k][-1]-1] = True
                solution(num + 1, v + abs(front[0] - L[k][0]) + abs(front[1] - L[k][1]), visited, L[k], able)
                visited[k] = False
                able[L[k][-1] - 1] = False
            else:
                if able[L[k][-1]*(-1)-1] == True:
                    visited[k] = True
                    solution(num + 1, v + abs(front[0] - L[k][0]) + abs(front[1] - L[k][1]), visited, L[k], able)
                    visited[k] = False
for tc in range(1, T + 1):
    N = int(input())
    start = (0,0,0)
    L = []
    ans = float('inf')
    for i in range(N):
        t = input().split()
        for j in range(N):
            if t[j] != '0':
                L.append((i, j, int(t[j])))
    h = len(L)
    vit = [False] * h
    able = [False] * (h//2)
    solution(0,0,vit,start,able)
    print(f"#{tc} {ans}")
