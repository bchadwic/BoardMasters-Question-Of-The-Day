func countMatches(items [][]string, ruleKey string, ruleValue string) int {
    result := 0
    for _, e := range items {
        if ruleKey == "type" && e[0] == ruleValue {
                result++
        } else if ruleKey == "color" && e[1] == ruleValue {
                result++
        } else if ruleKey == "name" && e[2] == ruleValue {
                result++
        }
    }
    return result
}
