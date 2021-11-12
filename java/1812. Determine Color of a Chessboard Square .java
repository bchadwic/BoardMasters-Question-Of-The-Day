class Solution {
/*
    You are given coordinates, a string that represents the
    coordinates of a square of the chessboard. Below is a
    chessboard for your reference. Return true if the square
    is white, and false if the square is black. The coordinate
    will always represent a valid chessboard square. The
    coordinate will always have the letter first, and the
    number second.

    Constraints:
        coordinates.length == 2
        'a' <= coordinates[0] <= 'h'
        '1' <= coordinates[1] <= '8'

    Questions:
        Do the colors of a square ever change?: No
        What is the color of the square at 'a1'?: Black

    Thought Process:
    The squares are alternating horizontally and vertially so
    there is a pattern to the color locations.  If we look at
    the sum of coordinate values for each white square, their
    sums are all odd numbers. If i sum the coordinate values
    and sum % 2 != 0, then we have found a white square.
    Solution is O(1)
          _______________
        8|9|X| |X| |X| |X|
        7|X|9|X| |X| |X| |
        6|7|X|9|X| |X| |X|
        5|X|7|X|9|X| |X| |
        4|5|X|7|X|9|X| |X|
        3|X|5|X|7|X|9|X| | etc...
        2|3|X|5|X|7|X|9|X|
        1|X|3|X|5|X|7|X|9|
          a b c d e f g h
*/

    public boolean squareIsWhite(String coordinates)
    {
        return ((coordinates.charAt(0)+ coordinates.charAt(1)) % 2) != 0;
    }
}