class Solution(object):
    def __init__(self):
        self.path = []

    def minMutation(self, start, end, bank):
        """
        :type start: str
        :type end: str
        :type bank: List[str]
        :rtype: int
        """
        bank_set = set(bank)
        if end not in bank:
            return -1
        if start in bank:
            bank_set.remove(start)

        def compare_DNA(dna1, dna2):
            count = 0
            if len(dna1) != len(dna2):
                return 0
            for x in range(len(dna1)):
                if dna1[x] != dna2[x]:
                    count += 1
            return count

        self.path = []

        def dfs(st, previous, level):
            if previous is end:
                self.path.append(level)
                return
            if not st:
                return
            # dfs body
            for x in st:
                st.remove(x)
                if compare_DNA(x, previous) is 1:
                    dfs(st, x, level + 1)
                st.add(x)

        dfs(bank_set, start, 0)
        if not self.path:
            return -1
        else:
            return min(self.path)

# test result
def main():
    so = Solution()
    print(so.minMutation("AACCGGTT", "AACCGGTA", ["AACCGGTA"]))


if __name__ == '__main__':
    main()
