#!/usr/bin/env python3

def two_sum(a : list[int], target: int)->list[int]:
    l = 0
    h = len(a) - 1
    while( l < h ):
        sum = a[l] + a[h]
        if sum < target:
            l += 1
        elif sum > target:
            h -= 1
        else:
            return [l+1,h+1]
    return []            

if __name__ == "__main__":
    print("Enter the Elements : ")
    list = [int(x) for x in input().split()]
    print("Enter the target : ")
    target = int(input())
    print("Result : ", two_sum(list,target))
