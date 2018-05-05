import time
import numpy as np

class Solution:
    def __init__(self, matrix1, matrix2):
        # assume matrix are square
        self.matrix1 = matrix1
        self.matrix2 = matrix2
        self.length = len(matrix1)
        self.max_moving = len(matrix1) ** 2

    def move_difference(self, row, column):
        total = 0
        for i in range(self.length):
            for j in range(self.length):
                if 0 <= i - row < self.length and 0 <= j - column < self.length:
                    total += abs(self.matrix2[i - row][j - column] - self.matrix1[i][j])
                else:
                    total += self.matrix1[i][j]
        return total

    def move_best_match(self):
        best_case = None
        for row in range(-(self.length - 1), self.length):
            for column in range(-(self.length - 1), self.length):
                score = self.move_difference(row, column)
                if score < self.max_moving:
                    self.max_moving = score
                    best_case = list([row, column]).copy()
        return best_case


def main():
    """
    from:
    [[0 0 0]
     [0 1 0]
     [1 1 0]]
    to
    [[0 1 1]
     [0 1 1]
     [0 0 0]]
    """
# Runtime test test
    #m1, m2 = np.random.binomial(1, 0.5, size = [50, 50]), np.random.binomial(1, 0.3, size = [50, 50]) 
    m1, m2 = np.random.binomial(1, 0.5, size = [10, 10]), np.random.binomial(1, 0.3, size = [10, 10]) 
    #m1, m2 = np.random.binomial(1, 0.5, size = [100, 100]), np.random.binomial(1, 0.3, size = [100, 100]) 
    #s = Solution([[0, 0, 0], [0, 1, 0], [1, 1, 0]], [[0, 1, 1], [0, 1, 1], [0, 0, 0]])
    s = Solution(m1, m2)
    best_move = s.move_best_match()
    print(best_move)
    print(s.move_difference(best_move[0], best_move[1]))

starttime = time.time()
if __name__ == '__main__':
    main()
endtime = time.time()

print(endtime - starttime)