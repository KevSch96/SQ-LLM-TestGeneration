from quine_mc_cluskey import *
import pytest

def test_initialization():
    """
    Empty test case, just for setup.
    """

def test_compare_string_one_char_diff():
    assert compare_string('0010', '0110') == '0_10'


def test_compare_string_more_than_one_char_diff():
    assert compare_string('0110', '1101') == False


def test_selection_specific_chart():
    chart = [[1]]
    prime_implicants = ['0.00.01.5']
    
    essential_prime_implicants = selection(chart, prime_implicants)
    
    assert essential_prime_implicants == ['0.00.01.5']


def test_main_single_minterm():
    no_of_variable = 3
    minterms = [1.5]
    binary = decimal_to_binary(no_of_variable, minterms)
    
    prime_implicants = check(binary)
    chart = prime_implicant_chart(prime_implicants, binary)
    
    essential_prime_implicants = selection(chart, prime_implicants)
    
    assert essential_prime_implicants == ['0.00.01.5']


def test_is_for_table_strings_count():
    assert is_for_table('__1', '011', 2) == True
    assert is_for_table('01_', '001', 1) == False


def test_decimal_to_binary_single_minterm():
    assert decimal_to_binary(3, [1.5]) == ['0.00.01.5']


def test_check_binary_strings():
    assert check(['0.00.01.5']) == ['0.00.01.5']


def test_compare_string_one_char_diff():
    assert compare_string('0010', '0110') == '0_10'
