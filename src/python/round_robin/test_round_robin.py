from round_robin import *
import pytest

def test_initialization():
    """
    Empty test case, just for setup.
    """

def test_some_processes_finish_at_quantum():
    assert calculate_waiting_times([3, 2, 2]) == [4, 2, 4]


def test_all_processes_finish_within_quantum():
    assert calculate_waiting_times([2, 2, 2]) == [0, 2, 4]


def test_waiting_times_greater_than_burst_times():
    assert calculate_turn_around_times([1, 2, 3], [5, 6, 7]) == [6, 8, 10]


def test_calculate_turn_around_times():
    assert calculate_turn_around_times([1, 2, 3], [0, 1, 3]) == [1, 3, 6]