class Solution:
    def quick_sort(self, arr):
        # copy array to do operation
        sort_arr = arr.copy()

        # partition the array and make some swap
        def partition(low, high):
            nonlocal sort_arr
            # the right end as pivot
            pivot = sort_arr[high]
            i = low - 1
            # from (low) ~ (high - 1)
            for j in range(low, high, 1):
                if sort_arr[j] < pivot:
                    # when find less than pivot, i originally is <= pivot
                    i += 1
                    # then i + 1 is > pivot
                    sort_arr[i], sort_arr[j] = sort_arr[j], sort_arr[i]
            # i + 1 > pivot (from right to the pivot position)
            sort_arr[i + 1], sort_arr[high] = sort_arr[high], sort_arr[i + 1]
            # return the pivot position
            return i + 1

        # dfs of quick_sort
        def sort_dfs(low, high):
            nonlocal sort_arr
            # terminate condition
            if low < high:
                pivot_location = partition(low, high)
                # left to pivot position - 1 (all these less than pivot)
                sort_dfs(low, pivot_location - 1)
                # pivot position + 1 to right (all these larger than pivot)
                sort_dfs(pivot_location + 1, high)

        sort_dfs(0, len(sort_arr) - 1)
        return sort_arr


def main():
    s = Solution()
    print(s.quick_sort([5, 2, 7, 3, 1, 8, 4]))


if __name__ == '__main__':
    main()
