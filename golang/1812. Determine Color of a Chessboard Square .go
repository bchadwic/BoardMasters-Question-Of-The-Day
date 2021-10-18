func squareIsWhite(c string) bool {
    // even letters start black, odd start white
    // a = 0, 1 = 1 >> chessboard is not zero indexed
    // odd odd = white
    // even odd = black
    // even even = white
    // odd even = black
    // xor is needed for this problem
    // & 1 is the same as % 2 in this scenario, but its typically faster
    return int(c[0] - 26) & 1 == 0 != (int(c[1]) & 1 == 0)
}
