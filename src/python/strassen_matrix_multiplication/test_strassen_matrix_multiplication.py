from strassen_matrix_multiplication import *
import pytest

def test_initialization():
    """
    Empty test case, just for setup.
    """

def test_strassen_algorithm():
    matrix_a = [[2, 1, 3], [3, 4, 6], [1, 4, 2], [7, 6, 7]]
    matrix_b = [[4, 2, 3, 4], [2, 1, 1, 1], [8, 6, 4, 2]]
    result = strassen(matrix_a, matrix_b)
    assert result == [[34, 23, 19, 15], [68, 46, 37, 28], [28, 18, 15, 12], [96, 62, 55, 48]]


def test_split_matrix_4x4():
    matrix = [[4, 3, 2, 4], [2, 3, 1, 1], [6, 5, 4, 3], [8, 4, 1, 6]]
    top_left, top_right, bot_left, bot_right = split_matrix(matrix)
    assert top_left == [[4, 3], [2, 3]]
    assert top_right == [[2, 4], [1, 1]]
    assert bot_left == [[6, 5], [8, 4]]
    assert bot_right == [[4, 3], [1, 6]]


def test_odd_matrices_exception():
    with pytest.raises(Exception):
        matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        split_matrix(matrix)