func isThree(n int) bool {
    // the only numbers that have three divsors are perfect squares that are prime otherwise
    if n == 4 { // only even square that doesn't have other multiples
        return true
    }
    
    if n % 2 == 0 { // all even numbers are divisible by 2, therefore not prime
        return false
    }
    
    for i := 3; i < n; i += 2 { // check all the odd numbers to verify prime-ness
        if i * i > n {
            return false
        } else if i * i == n { // if n has a perfect square at this point, the number is valid
            return true
        } else if n % i == 0 {
            return false
        }
    }
    return false
}
