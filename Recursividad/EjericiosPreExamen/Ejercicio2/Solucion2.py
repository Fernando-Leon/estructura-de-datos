
def Serie(n, c1 = 1, c2 = 1):
    if n != 0:
        r = c1 / c2
        return r + Serie(n-1, c1 * 2, c2 *3)
    return 0;

print(Serie(2))