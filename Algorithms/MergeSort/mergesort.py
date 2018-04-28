class Solution:
    def merge_sort(self, sort_arr):
        def merge(arr1, arr2):
            stack = []
            # two list has element, merge it to sorted subarray
            while arr1 and arr2:
                if arr1[0] > arr2[0]:
                    stack.append(arr2[0])
                    arr2.pop(0)
                else:
                    stack.append(arr1[0])
                    arr1.pop(0)
            # if only one have element, push to the end
            stack = stack + arr1 + arr2
            return stack

        def mergesort(arr):
            if len(arr) == 1:
                return arr
            # divide into left and right array
            mid = len(arr) // 2
            l1 = mergesort(arr[0: mid])
            l2 = mergesort(arr[mid: len(arr)])
            return merge(l1, l2)

        return mergesort(sort_arr)


def main():
    s = Solution()
    print(s.merge_sort([5, 2, 7, 3, 1, 8, 4]))


if __name__ == '__main__':
    main()
