func distributeCandies(candyType []int) int {
	set := make(map[int]bool)

	diff := 0
	avail := len(candyType) / 2

	for _, e := range candyType {
		if len(set) > avail {
			return avail
		}
		if ok := set[e]; !ok {
			set[e] = true
			diff++
		}
	}

	if len(set) > avail {
		return avail
	}
	return diff
}