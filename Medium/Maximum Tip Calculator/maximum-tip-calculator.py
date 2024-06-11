
from typing import List

import heapq
class Solution:
    def maxTip(self, n : int, x : int, y : int, arr : List[int], brr : List[int]) -> int:
        # code here
        # ans = [0 for i in range(n)]
        heap = []
        ans = 0
        for i in range(n):
            heapq.heappush(heap, [-1*(abs(arr[i] - brr[i])), arr[i], brr[i]])
        while(heap):
            diff, a, b = heapq.heappop(heap)
            if a > b and x > 0:
                ans += a 
                x-=1
            elif a < b and y > 0:
                ans += b
                y-=1
            else:
                if x != 0 :
                    ans += a 
                elif y != 0 :
                    ans += b 
        return ans

#{ 
 # Driver Code Starts
class IntArray:

    def __init__(self) -> None:
        pass

    def Input(self, n):
        arr = [int(i) for i in input().strip().split()]  #array input
        return arr

    def Print(self, arr):
        for i in arr:
            print(i, end=" ")
        print()


if __name__ == "__main__":
    t = int(input())
    for _ in range(t):

        n = int(input())

        x = int(input())

        y = int(input())

        arr = IntArray().Input(n)

        brr = IntArray().Input(n)

        obj = Solution()
        res = obj.maxTip(n, x, y, arr, brr)

        print(res)

# } Driver Code Ends