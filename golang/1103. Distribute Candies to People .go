
func distributeCandies(candies int, num_people int) []int {
    people := make([]int, num_people)
    candy := 0
    
    for i := 0; candies > 0; i = findIndex(i, num_people) {
        candy++
        candies -= candy
        if candies > 0 {
            people[i] += candy
        } else {
            people[i] += candies + candy
        }
    }
    
    return people
}

func findIndex(i, size int) int {
    i++
    if i >= size {
        return 0
    }
    return i
}
