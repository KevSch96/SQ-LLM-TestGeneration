from greedy_knapsack import calc_profit
import pytest

def test_suite():
    # empty method
    pass

def test_large_data_set():
    assert calc_profit([10, 9, 8, 7, 6, 5, 4, 3, 2, 1], [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 55) == 55


def test_negative_profit():
    with pytest.raises(ValueError):
        calc_profit([-1, 2, 3], [3, 4, 5], 15)


def test_max_weight_less_than_or_equal_to_zero():
    with pytest.raises(ValueError):
        calc_profit([1, 2, 3], [3, 4, 5], 0)


def test_specific_input_calculation():
    assert calc_profit([1, 2, 3], [3, 4, 5], 15) == 6


def test_all_negative_profits():
    with pytest.raises(ValueError):
        calc_profit([-5, -8, -7, -1, -12, -3, -4], [2, 7, 1, 6, 4, 2, 5], 15)


