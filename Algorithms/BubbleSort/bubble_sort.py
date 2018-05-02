class Solution:
    def bubble_sort(self, array):
        for j in range(len(array) - 1):
            for i in range(len(array) - j - 1):
                if array[i] > array[i + 1]:
                    array[i], array[i + 1] = array[i + 1], array[i]
        return array


def main():
    s = Solution()
    print(s.bubble_sort([4, 3, 2, 1, 6, 5, 4, 3, 2]))


if __name__ == '__main__':
    main()
