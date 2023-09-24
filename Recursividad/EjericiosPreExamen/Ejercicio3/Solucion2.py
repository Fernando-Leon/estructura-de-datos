def Serie(n, c1=1, c2=2):
    if n != 0:
        return ((1/c1) - (1/c2)) + Serie(n-1, c1+1, c2+1)
    return 0

print(Serie(2))