class Solution:
    def insertion_sort(self, array):
        for i in range(len(array) - 1):
            j = i
            num = array[i + 1]
            while j >= 0 and array[j] > num:
                array[j + 1] = array[j]
                j -= 1
            array[j + 1] = num
        return array


def main():
    s = Solution()
    print(s.insertion_sort([1, 7, 5, 2, 0, 9, 8, 4, 10, 6, 3]))


if __name__ == '__main__':
    main()
